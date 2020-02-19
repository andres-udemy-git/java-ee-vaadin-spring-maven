package com.udemy.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        Student s = (Student)appContext.getBean("student_prototype_bean");
        System.out.println(s.getName());
        s.setName("Jack");
        Student s2 = (Student)appContext.getBean("student_prototype_bean");
        System.out.println(s2.getName());

        s = (Student)appContext.getBean("student_singleton_bean");
        System.out.println(s.getName());
        s.setName("Jack");
        s2 = (Student)appContext.getBean("student_singleton_bean");
        System.out.println(s2.getName());
    }
}
