package com.coolweather.android.gson;

public class AQI {
    public AQICity city;

    public class AQICity{

        public String api;  //  空气质量指数
        public String pm25; //pm2.5浓度
    }
}
