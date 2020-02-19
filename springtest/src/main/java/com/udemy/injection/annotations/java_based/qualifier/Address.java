package com.udemy.injection.annotations.java_based.qualifier;

public class Address {

    private String address;

    public Address() {
        address = "Constructor Address";
    }

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
