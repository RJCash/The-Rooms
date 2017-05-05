package com.theironyard;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by rickiecashwell on 4/28/17.
 */

public class Group {
    Integer id;
    String name;
    String location;
    String time;
    String day;
    List<String> type;
    String city;
    LocalTime timeconverter;
    DateTimeFormatter inputformatter = DateTimeFormatter.ofPattern("kk:mm:ss");
    DateTimeFormatter outputformatter = DateTimeFormatter.ofPattern("hh:mm a");

    public Group(Integer id, String name, String location, String time, String day, String city, List<String> types) {
        this.id = id;
        this.name = name;
        this.location = location;
        LocalTime templateTime = timeconverter.parse(time,inputformatter);
        this.time = outputformatter.format(templateTime);
        this.day = day;
        this.city = city;
        this.type = types;
        
    }
    public Group() {
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }
}