package com.seriesapp.seriesapp.controller;

import com.seriesapp.seriesapp.model.UserSeries;
import com.seriesapp.seriesapp.service.UserSeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserSerieController {

    @Autowired
    private UserSeriesService userSeriesService;

    @PostMapping("/user/{userId}/serie/{serieId}")
    @ResponseStatus(HttpStatus.CREATED)
    public UserSeries favorite(@PathVariable Long userId, @PathVariable Long serieId) {
        return userSeriesService.favorite(userId, serieId);
    }
}
