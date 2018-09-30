package com.geolocation.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.geolocation.models.classes.Location;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationController {
    @GetMapping("/location/")
    public String new_location(@RequestParam("latitude") double latitude, @RequestParam("longitude") double longitude){
        Location location = new Location(latitude,longitude);
        location.setId(1);
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(location);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "welcome_to_location";
    }
}
