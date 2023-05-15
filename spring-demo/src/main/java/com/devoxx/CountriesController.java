package com.devoxx;

import com.devoxx.restclient.model.RestCountry;
import com.devoxx.service.CountriesService;
import java.util.List;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/countries")
public class CountriesController {

    private final CountriesService service;

    public CountriesController(CountriesService service) {
        this.service = service;
    }

    @GetMapping
    public Mono<List<RestCountry>> all(@RequestParam(required = false) List<String> names) {
        return getAllCountriesImpl(names).collectList();
    }

    private Flux<RestCountry> getAllCountriesImpl(List<String> names) {
        if (names != null && !names.isEmpty()) {
            return service.getCountriesByName(names);
        }
        return service.getAllCountries();
    }

    @GetMapping(path = "/dummy")
    public RestCountry dummy() {
        return RestCountry.DUMMY;
    }
}
