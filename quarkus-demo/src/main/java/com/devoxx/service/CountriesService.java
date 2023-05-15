package com.devoxx.service;

import com.devoxx.restclient.CountriesRestClient;
import com.devoxx.restclient.model.RestCountry;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import java.util.ArrayList;
import java.util.List;
import jakarta.inject.Singleton;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Singleton
public class CountriesService {

    private final CountriesRestClient client;

    public CountriesService(@RestClient CountriesRestClient client) {
        this.client = client;
    }


    public Uni<List<RestCountry>> getAllCountries() {
        return client.getAll();
    }

    public Uni<List<RestCountry>> getCountryByNames(List<String> names) {
        return Multi.createFrom().iterable(names)
                .onItem()
                .transformToUniAndMerge(client::getByName)
                .collect()
                .in(ArrayList::new, List::addAll);
    }
}
