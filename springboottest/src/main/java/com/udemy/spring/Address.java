package com.udemy.spring;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String address = "Wall Street 42";

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
