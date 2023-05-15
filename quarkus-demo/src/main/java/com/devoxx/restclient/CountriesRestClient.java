package com.devoxx.restclient;

import com.devoxx.restclient.model.RestCountry;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.List;

@RegisterRestClient(configKey = "countries-api")
@Path("v3.1")
public interface CountriesRestClient {

    @GET
    @Path("all")
    Uni<List<RestCountry>> getAll();

    @GET
    @Path("name/{name}")
    Uni<List<RestCountry>> getByName(String name);
}
