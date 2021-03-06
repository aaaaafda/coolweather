package com.example.imp.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Imp on 2017/10/9.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private  String weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getWeatherID(){
        return weatherId;
    }
    public void setWeatherID(String weatherID){
        this.weatherId=weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
