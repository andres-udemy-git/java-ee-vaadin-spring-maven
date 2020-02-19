package com.udemy.injection.annotations.java_based.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Student s = (Student) context.getBean("student_qualifier_annotation_bean");
        s.setName("Name");
        s.showInfo();
    }

}
