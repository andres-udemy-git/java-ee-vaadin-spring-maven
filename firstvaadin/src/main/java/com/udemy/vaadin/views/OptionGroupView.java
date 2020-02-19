package com.udemy.vaadin.views;

import com.udemy.vaadin.model.Student;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

import java.util.Set;

@SpringUI(path = "/optiongroup")
@Theme("valo")
public class OptionGroupView extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Layout layout = new VerticalLayout();

        OptionGroup optionGroup = new OptionGroup("Universities");
        optionGroup.addItem("MIT");
        optionGroup.addItem("Caltech");
        optionGroup.addItem("Harvard");
        optionGroup.addValueChangeListener(event -> Notification.show(event.getProperty().toString()));
        layout.addComponent(optionGroup);

        OptionGroup students = new OptionGroup("Students");
        students.addItem(new Student("John", 22));
        students.addItem(new Student("Mary", 25));
        students.addValueChangeListener(event -> Notification.show(event.getProperty().toString()));
        layout.addComponent(students);

        OptionGroup students2 = new OptionGroup("Students");
        students2.setMultiSelect(true);
        students2.addItem(new Student("John", 22));
        students2.addItem(new Student("Mary", 25));
        students2.addItem(new Student("Adam", 18));
        students2.addValueChangeListener(event -> ((Set)event.getProperty().getValue()).forEach(student -> System.out.println(student)));
        layout.addComponent(students2);

        setContent(layout);
    }
}
