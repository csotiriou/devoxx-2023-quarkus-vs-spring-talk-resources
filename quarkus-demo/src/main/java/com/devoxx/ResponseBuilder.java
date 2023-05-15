package com.devoxx;

import com.devoxx.restclient.model.RestCountry;
import io.smallrye.mutiny.Uni;
import java.util.List;
import jakarta.inject.Singleton;
import jakarta.ws.rs.core.HttpHeaders;
import org.jboss.resteasy.reactive.RestResponse;

@Singleton
public class ResponseBuilder {

    public static final String X_CUSTOM_HEADER = "X-Test";

    private final HttpHeaders headers;

    public ResponseBuilder(HttpHeaders headers) {
        this.headers = headers;
    }

    public Uni<RestResponse<List<RestCountry>>> toResponse(Uni<List<RestCountry>> countries) {
        return countries.map(c -> RestResponse.ResponseBuilder.ok(c).header(X_CUSTOM_HEADER, headers.getHeaderString(X_CUSTOM_HEADER)).build());
    }
}
