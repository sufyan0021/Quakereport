package com.example.android.quakereport;


import android.util.Log;

/**
 * Created by sufya on 13-07-2017.
 */

public class Earthquake_Data {

    private String magnitude;
    private String location;
    private String time;
    public Earthquake_Data(String mag, String loc, String tym)
    {
        this.magnitude=mag;
        this.location=loc;
        this.time=tym;
    }

    public String getMagnitude()
    {
        return magnitude;
    }

    public String getLocation()
    {
        return location;
    }

    public  String getTime()
    {
        return time;
    }
}
