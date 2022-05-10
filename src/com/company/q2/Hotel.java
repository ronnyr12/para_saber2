package com.company.q2;

public class Hotel {
    private String name;
    private String city;
    private int rate;

    public Hotel(String name, String city, int rate) {
        this.name = name;
        this.city = city;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
