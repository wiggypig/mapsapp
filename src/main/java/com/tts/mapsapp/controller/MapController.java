package com.tts.mapsapp.controller;

import com.tts.mapsapp.model.Location;
import com.tts.mapsapp.service.MapService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MapController {


    @Autowired
    private MapService mapService;
    private Logger logger = LoggerFactory.getLogger(MapController.class);

    @GetMapping("/home")
    public String getDefaultMap(Model model) {
/*        Location location = new Location();
        location.setCity("Southlake");
        location.setState("Texas");
        mapService.addCoordinates(location);
        System.out.println(location);
        logger.debug("This is my location: {}", location);*/
        model.addAttribute(new Location());
        return "index.html";
    }

    @PostMapping("/home")
    public String getMapForLocation(Location location, Model model) {
        mapService.addCoordinates(location);
        model.addAttribute("location",location);
        return "index.html";
    }

}
