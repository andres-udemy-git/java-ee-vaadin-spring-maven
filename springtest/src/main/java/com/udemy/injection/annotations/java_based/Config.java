package com.udemy.injection.annotations.java_based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "student_java_annotation_bean")
    public Student getStudent() {
        return new Student();
    }

    @Bean
    public Address getAddress() {
        return new  Address();
    }
}
