package com.example.lovesun.firstcode_coolweather.gson;

/**
 * Created by Love—Sun on 2017/6/2.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
