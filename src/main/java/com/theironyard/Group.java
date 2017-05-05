package com.theironyard;

/**
 * Created by rickiecashwell on 4/28/17.
 */

public class Group {
    Integer id;
    String name;
    String location;
    String time;
    String day;
    String type;
    String city;

    public Group(Integer id, String name, String location, String time, String day,String type, String city) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.time = time;
        this.day = day;
        this.type = type;
        this.city = city;
        
    }
    public String toString(){
       return  "{Group" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Location='" + location + '\'' +
                ", Time='" + time + '\'' +
                ", Day='" + day + '\'' +
                ", Type='" + type + '\'' +
                ", City='" + city ;
    }
    public Group() {
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
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