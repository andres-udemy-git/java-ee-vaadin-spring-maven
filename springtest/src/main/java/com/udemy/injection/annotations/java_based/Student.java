package com.udemy.injection.annotations.java_based;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private String name;

    @Autowired
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println(name + "s Address is " + address.getAddress());
    }
}
