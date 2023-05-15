package com.devoxx.service;

import com.devoxx.restclient.CountriesRestClient;
import com.devoxx.restclient.model.RestCountry;
import java.util.List;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class CountriesService {

    private final CountriesRestClient client;

    public CountriesService(CountriesRestClient client) {
        this.client = client;
    }

    public Flux<RestCountry> getAllCountries() {
        return client.getAll();
    }

    public Flux<RestCountry> getCountriesByName(List<String> names) {
        return Flux.fromIterable(names)
                .flatMap(client::getByName, 5);
    }
}
