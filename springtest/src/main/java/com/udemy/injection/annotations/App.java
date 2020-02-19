package com.udemy.injection.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student s = (Student) context.getBean("student_injection_annotation_bean");
        s.showInfo();
    }
}
