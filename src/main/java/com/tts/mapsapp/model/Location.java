package com.tts.mapsapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Location {

    private String city;
    private String state;
    private String lat;
    private String lng;

    public Location() {
    }

    public Location(String city, String state, String lat, String lng) {
        this.city = city;
        this.state = state;
        this.lat = lat;
        this.lng = lng;
    }
}
