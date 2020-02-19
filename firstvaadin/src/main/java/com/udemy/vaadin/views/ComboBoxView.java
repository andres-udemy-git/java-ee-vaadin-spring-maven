package com.udemy.vaadin.views;

import com.udemy.vaadin.model.Student;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@SpringUI(path="/combobox")
@Theme("valo")
public class ComboBoxView extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Layout layout = new VerticalLayout();

        ComboBox comboBox = new ComboBox();
        comboBox.addItem(new Student("John", 22));
        comboBox.addItem(new Student("Mary", 25));
        comboBox.addItem(new Student("Adam", 18));
        comboBox.addValueChangeListener(event -> Notification.show(event.getProperty().toString()));
        comboBox.setFilteringMode(FilteringMode.STARTSWITH);
        layout.addComponent(comboBox);

        setContent(layout);
    }
}
