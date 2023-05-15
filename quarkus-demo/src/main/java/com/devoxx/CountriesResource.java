package com.devoxx;

import com.devoxx.restclient.model.RestCountry;
import com.devoxx.service.CountriesService;
import io.smallrye.common.annotation.NonBlocking;
import io.smallrye.mutiny.Uni;
import java.util.List;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.jboss.resteasy.reactive.RestQuery;
import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.Separator;

@Path("/countries")
public class CountriesResource {

    private final CountriesService countriesService;
    private final ResponseBuilder responseBuilder;

    public CountriesResource(CountriesService countriesService,
                             ResponseBuilder responseBuilder) {
        this.countriesService = countriesService;
        this.responseBuilder = responseBuilder;
    }


    @GET
    @Path("/")
    public Uni<RestResponse<List<RestCountry>>> getAllCountries(@Separator(",") @RestQuery List<String> names) {
        return responseBuilder.toResponse(getAllCountriesImpl(names));
    }

    @GET
    @Path("/secured")
    public Uni<List<RestCountry>> getAllCountriesSecured(@Separator(",") @RestQuery List<String> names) {
        return getAllCountriesImpl(names);
    }

    private Uni<List<RestCountry>> getAllCountriesImpl(List<String> names) {
        if (names != null && !names.isEmpty()) {
            return countriesService.getCountryByNames(names);
        }
        return countriesService.getAllCountries();
    }

    @GET
    @Path("dummy")
    @NonBlocking
    public RestCountry dummy() {
        return RestCountry.DUMMY;
    }
}


