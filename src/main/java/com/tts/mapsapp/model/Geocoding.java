package com.tts.mapsapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Geocoding {

    private Geometry geometry;

    public Geocoding(Geometry geometry) {
        this.geometry = geometry;
    }

    public Geocoding() {
    }
}
