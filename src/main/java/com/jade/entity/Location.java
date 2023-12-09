package com.jade.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Location extends BaseEntity {
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "state")
    private String state;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "main_street")
    private String mainStreet;
    @Basic
    @Column(name = "side_street")
    private String sideString;
    @Basic
    @Column(name = "number")
    private String number;
    @Basic
    @Column(name = "floor")
    private Integer name;
    @Basic
    @Column(name = "latitude")
    private String latitude;
    @Basic
    @Column(name = "longitude")
    private String longitude;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMainStreet() {
        return mainStreet;
    }

    public void setMainStreet(String mainStreet) {
        this.mainStreet = mainStreet;
    }

    public String getSideString() {
        return sideString;
    }

    public void setSideString(String sideString) {
        this.sideString = sideString;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
