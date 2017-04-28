package com.theironyard;

import java.time.LocalTime;

/**
 * Created by rickiecashwell on 4/28/17.
 */

public class Group {
    Integer id;
    String name;
    String location;
    LocalTime time;
    String day;
    String type;

    public Group(Integer id, String name, String location, LocalTime time, String day) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.time = time;
        this.day = day;
        
    }
    public Group() {
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

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}