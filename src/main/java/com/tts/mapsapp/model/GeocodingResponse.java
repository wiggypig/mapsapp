package com.tts.mapsapp.model;

import lombok.Data;
import java.util.List;

@Data
public class GeocodingResponse {

    private List<Geocoding> results;

    public List<Geocoding> getResults() {
        return results;
    }

    public void setResults(List<Geocoding> results) {
        this.results = results;
    }
}
