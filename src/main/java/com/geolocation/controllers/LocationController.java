package com.geolocation.controllers;

import com.geolocation.models.classes.Location;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationController {
    @GetMapping("/location/")
    public String new_location(@RequestParam("latitude") double latitude, @RequestParam("longitude") double longitude){
        Location location = new Location(latitude,longitude);
        location.setId(1);
        return "welcome_to_location";
    }
}
