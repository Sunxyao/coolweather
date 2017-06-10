package com.example.lovesun.firstcode_coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Love—Sun on 2017/5/31.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    @Override
    public String toString() {
        return "City{" +
                "provinceId=" + provinceId +
                ", cityCode=" + cityCode +
                ", cityName='" + cityName + '\'' +
                ", id=" + id +
                '}';
    }
}
