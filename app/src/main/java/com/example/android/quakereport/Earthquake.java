package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tijojose27 on 10/14/2017.
 */

public class Earthquake {
    private String city;

    private double magnitude;

    public long geteDate() {
        return eDate;
    }

    private long eDate;

    public Earthquake(String city, double magnitude, long eDate) {
        this.city = city;
        this.magnitude = magnitude;
        this.eDate = eDate;
    }

    public String getCity() {
        return city;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getMagnitudeAsString(){
        String mag = String.valueOf(getMagnitude());
        return mag;
    }



    public String getStringeDate() {
        Date dateObj = new Date(eDate);
        SimpleDateFormat df = new SimpleDateFormat("MMM DD, yyyy");
        String thisDate = df.format(dateObj);
        return thisDate;
    }

}
