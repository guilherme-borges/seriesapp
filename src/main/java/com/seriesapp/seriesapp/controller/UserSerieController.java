package com.seriesapp.seriesapp.controller;

import com.seriesapp.seriesapp.model.UserSeries;
import com.seriesapp.seriesapp.service.UserSeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserSerieController {

    @Autowired
    private UserSeriesService userSeriesService;

    @PostMapping("/user/{userId}/serie/{serieId}")
    @ResponseStatus(HttpStatus.CREATED)
    public UserSeries favorite(@PathVariable Long userId, @PathVariable Long serieId) {
        return userSeriesService.favorite(userId, serieId);
    }

    @GetMapping("/usuario/{userId}/series")
    public List<UserSeries> findSeriesByUserId(@PathVariable Long userId) {
        return userSeriesService.findSerieByUser(userId);
    }
}
