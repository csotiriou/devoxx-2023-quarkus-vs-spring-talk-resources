package com.devoxx;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

//@Component
public class ForwardingHeaderFilter implements WebFilter {

    public static final String X_CUSTOM_HEADER = "X-Test";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        List<String> testHeader = exchange.getRequest().getHeaders().get(X_CUSTOM_HEADER);
        if (testHeader != null) {
            exchange.getResponse().getHeaders().put(X_CUSTOM_HEADER, testHeader);
        }
        return chain.filter(exchange);
    }
}
