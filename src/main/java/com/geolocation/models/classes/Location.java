package com.geolocation.models.classes;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Location {
    @Getter @Setter
    private int id;
    @Getter @Setter
    private double latitude;
    @Getter @Setter
    private double longitude;
    @Getter
    private String location_time;

    public Location(double latitude, double longitude){
        DateTime dateTime = DateTime.now();
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss ZZ");
        location_time = formatter.print(dateTime);

        this.latitude = latitude;
        this.longitude = longitude;
    }
}
