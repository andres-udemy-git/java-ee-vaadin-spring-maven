package com.udemy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        Student s = (Student)appContext.getBean("student_bean");
        s.sayHello();
    }
}