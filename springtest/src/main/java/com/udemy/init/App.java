package com.udemy.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("Lolololololol");
        Student s = (Student)context.getBean("student_init_bean");
        System.out.println(s.getName());

        ((ConfigurableApplicationContext)context).close();
    }
}
