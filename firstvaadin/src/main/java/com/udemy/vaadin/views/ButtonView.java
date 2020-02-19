package com.udemy.vaadin.views;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@SpringUI(path="/button")
@Theme("valo")
public class ButtonView extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Layout layout = new VerticalLayout();

        Label result = new Label();

        Button button = new Button("Click me!");
        button.addClickListener(event -> Notification.show("Button clicked"));

        layout.addComponent(button);

        setContent(layout);
    }
}
