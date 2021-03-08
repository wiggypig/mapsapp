package com.tts.mapsapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Geometry {

    private Location location;

    public Geometry() {
    }

    public Geometry(Location location) {
        this.location = location;
    }
}
