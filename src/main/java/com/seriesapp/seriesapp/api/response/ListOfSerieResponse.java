package com.seriesapp.seriesapp.api.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.seriesapp.seriesapp.domain.model.Serie;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ListOfSerieResponse {

    private List<Serie> results;
}
