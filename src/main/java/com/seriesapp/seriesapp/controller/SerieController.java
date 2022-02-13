package com.seriesapp.seriesapp.controller;

import com.seriesapp.seriesapp.model.Serie;
import com.seriesapp.seriesapp.response.ListOfSerieResponse;
import com.seriesapp.seriesapp.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private SerieService serieService;

    @GetMapping
    public ResponseEntity<ListOfSerieResponse> getAllSeries() {

        return ResponseEntity.ok(serieService.getAllSeries());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Serie> getSerie(@PathVariable Long id) {

        return ResponseEntity.ok(serieService.getSerie(id));
    }
}