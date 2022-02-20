package com.seriesapp.seriesapp.service;

import com.seriesapp.seriesapp.model.Serie;
import com.seriesapp.seriesapp.repository.SerieRepository;
import com.seriesapp.seriesapp.repository.UserSeriesRepository;
import com.seriesapp.seriesapp.response.ListOfSerieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class SerieService {

    @Autowired
    private WebClient webClient;

    @Autowired
    private SerieRepository serieRepository;

    @Autowired
    private UserSeriesRepository userSeriesRepository;

    @Value("${tmdb_api_key}")
    public String tmdb_api_key;

    public ListOfSerieResponse findAllSeries() {
        return webClient
                .method(HttpMethod.GET)
                .uri("/tv/popular?api_key=" + tmdb_api_key + "&language=pt-BR&page=1")
                .retrieve()
                .bodyToFlux(ListOfSerieResponse.class).blockFirst();
    }

    public Serie findSerie(Long id) {
        Serie serie = serieRepository.findById(id)
                        .orElse(save(findAPISerie(id)));
        return serie;
    }

    public Serie findAPISerie(Long id) {
        return webClient
                .method(HttpMethod.GET)
                .uri("/tv/"+ id +"?api_key=" + tmdb_api_key + "&language=pt-BR")
                .retrieve()
                .bodyToMono(Serie.class).block();
    }

    public Serie save(Serie serie) {
        return serieRepository.save(serie);
    }
}