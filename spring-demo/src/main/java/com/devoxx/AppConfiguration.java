package com.devoxx;

import com.devoxx.restclient.CountriesRestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class AppConfiguration {

    @Bean
    public CountriesRestClient countriesRestClient(@Value("${countries.url}") String restCountriesURL) {
        var client = WebClient.builder()
                .baseUrl(restCountriesURL)
                .build();
        var factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
        return factory.createClient(CountriesRestClient.class);
    }

}
