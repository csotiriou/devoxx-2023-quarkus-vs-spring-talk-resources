package com.devoxx.restclient;

import com.devoxx.restclient.model.RestCountry;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import reactor.core.publisher.Flux;

@HttpExchange(url = "/v3.1")
public interface CountriesRestClient {

    @GetExchange("/all")
    Flux<RestCountry> getAll();

    @GetExchange("name/{name}")
    Flux<RestCountry> getByName(@PathVariable String name);
}
