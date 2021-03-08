package com.tts.mapsapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class GeocodingResponse {

    private List<Geocoding> results;

    public GeocodingResponse() {
    }

    public GeocodingResponse(List<Geocoding> results) {
        this.results = results;
    }
}
