package com.seriesapp.seriesapp.repository;

import com.seriesapp.seriesapp.model.UserSeries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSeriesRepository extends JpaRepository<UserSeries, Long> {
}
