package com.seriesapp.seriesapp.domain.service;

import com.seriesapp.seriesapp.api.response.ListOfSerieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class SerieService {

    @Autowired
    private WebClient webClient;

    @Value("${tmdb_api_key}")
    public String tmdb_api_key;

    public Flux<ListOfSerieResponse> getAllSeries() {
        return webClient
                .method(HttpMethod.GET)
                .uri("/tv/popular?api_key=" + tmdb_api_key + "&language=en-US&page=1")
                .retrieve()
                .bodyToFlux(ListOfSerieResponse.class);
    }
}
