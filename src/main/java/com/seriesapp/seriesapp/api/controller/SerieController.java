package com.seriesapp.seriesapp.api.controller;

import com.seriesapp.seriesapp.api.response.ListOfSerieResponse;
import com.seriesapp.seriesapp.domain.service.SerieService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/series")
@AllArgsConstructor
public class SerieController {

    private SerieService serieService;

    @GetMapping
    public ResponseEntity<Flux<ListOfSerieResponse>> getAllSeries() {

        return ResponseEntity.ok(serieService.getAllSeries());
    }
}
