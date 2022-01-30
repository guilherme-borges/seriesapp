package com.seriesapp.seriesapp.responses;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.seriesapp.seriesapp.models.Serie;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ListOfSerieResponse {

    private List<Serie> results;
}
