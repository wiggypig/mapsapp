package com.tts.mapsapp.model;

import lombok.Data;

@Data
public class Geometry {

    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
