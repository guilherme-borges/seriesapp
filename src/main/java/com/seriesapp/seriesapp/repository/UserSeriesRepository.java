package com.seriesapp.seriesapp.repository;

import com.seriesapp.seriesapp.model.UserSeries;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserSeriesRepository extends JpaRepository<UserSeries, Long> {

    public List<UserSeries> findByUserId(Long userId);
}
