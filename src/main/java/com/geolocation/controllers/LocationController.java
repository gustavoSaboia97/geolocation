package com.geolocation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
    @GetMapping("/location/")
    public String return_location(){
        return "welcome_to_location";
    }
}
