package com.udemy.injection.annotations.java_based.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "student_qualifier_annotation_bean")
    public Student getStudent() {
        return new Student();
    }

    @Bean(name = "1")
    public Address getAddress1() {
        return new Address("1");
    }

    @Bean(name = "2")
    public Address getAddress2() {
        return new Address("2");
    }
}
