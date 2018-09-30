package com.geolocation.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.geolocation.models.classes.Location;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class LocationControllerTest {
    private LocationController locationController;
    private Location location;

    @Before
    public void set_up(){
        locationController = new LocationController();
        location = new Location(-22.9241306,-43.2326032);
    }

    @Test
    public void test_if_new_location_works() {
        locationController.new_location(location.getLatitude(),location.getLongitude());
//        Assert.assertFalse(location.getLocation_time().isEmpty());
    }

    @Test
    public void test_if_new_location_returns_mapped_json() throws IOException {
        String  json = locationController.new_location(location.getLatitude(),location.getLongitude());
        ObjectMapper objectMapper = new ObjectMapper();
        Location location = objectMapper.readValue(json,Location.class);
    }
}
