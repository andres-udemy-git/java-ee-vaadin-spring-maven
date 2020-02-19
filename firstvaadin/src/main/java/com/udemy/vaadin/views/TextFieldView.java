package com.udemy.vaadin.views;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

@SpringUI(path = "/textfield")
@Title("Text Fields")
@Theme("valo")
public class TextFieldView extends UI {


    @Override
    protected void init(VaadinRequest vaadinRequest) {
        HorizontalLayout root = new HorizontalLayout();

        String value = "";
        ObjectProperty<String> property = new ObjectProperty<String>(value);

        TextField name = new TextField("Name", property);
        name.setImmediate(true);
        //name.setMaxLength(3);

        Label label = new Label(property);
        label.setCaption("Result: ");

        root.addComponent(name);
        root.addComponent(label);

        setContent(root);
    }
}
