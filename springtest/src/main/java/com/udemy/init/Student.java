package com.udemy.init;

public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void studentInit() {
        System.out.println("Student init...");
    }

    public void studentDestroy() {
        System.out.println("Student destroy...");
    }
}
