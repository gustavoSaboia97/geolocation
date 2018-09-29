package com.geolocation.controllers;

import com.geolocation.models.classes.Location;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LocationControllerTest {
    private LocationController locationController;
    private Location location;

    @Before
    public void set_up(){
        locationController = new LocationController();
        location = new Location(-22.9241306,-43.2326032);
    }

    @Test
    public void test_if_http_post_location_works() {
        locationController.new_location(location.getLatitude(),location.getLongitude());

//        Assert.assertFalse(location.getLocation_time().isEmpty());
    }
}
