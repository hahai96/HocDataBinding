package com.example.ha_hai.hocdatabinding.model;

/**
 * Created by ha_hai on 4/13/2018.
 */

public class Contact {

    private String phone;
    private String name;

    public Contact() {
    }

    public Contact(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
