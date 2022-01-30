package com.seriesapp.seriesapp.services;

import com.seriesapp.seriesapp.responses.ListOfSerieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class SerieService {

    @Autowired
    private WebClient webClient;

    public Flux<ListOfSerieResponse> getAllSeries() {
        return webClient
                .method(HttpMethod.GET)
                .uri("/tv/popular?api_key=e39cd96391bb53d7c56dfdb1e837cfc1&language=en-US&page=1")
                .retrieve()
                .bodyToFlux(ListOfSerieResponse.class);
    }
}
