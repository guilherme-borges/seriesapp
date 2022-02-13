package com.seriesapp.seriesapp.service;

import com.seriesapp.seriesapp.model.Serie;
import com.seriesapp.seriesapp.model.User;
import com.seriesapp.seriesapp.model.UserSeries;
import com.seriesapp.seriesapp.repository.UserSeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserSeriesService {

    @Autowired
    private UserSeriesRepository userSeriesRepository;

    @Autowired
    private SerieService serieService;

    @Autowired
    private UserService userService;

    @Transactional
    public UserSeries favorite(Long userId, Long serieId) {
        UserSeries userSeries = new UserSeries();

        Serie serie = serieService.getSerie(serieId);
        User user = userService.getUser(userId);

        userSeries.setSerie(serie);
        userSeries.setUser(user);
        return userSeriesRepository.save(userSeries);
    }
}
