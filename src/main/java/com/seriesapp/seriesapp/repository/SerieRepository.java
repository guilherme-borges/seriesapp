package com.seriesapp.seriesapp.repository;

import com.seriesapp.seriesapp.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
