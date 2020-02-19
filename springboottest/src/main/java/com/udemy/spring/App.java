package com.udemy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@ComponentScan
@RestController
public class App {

    @Autowired
    private Student student;

    @RequestMapping("/")
    public String student() {
        return student.showInfo();
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World from Spring Boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
