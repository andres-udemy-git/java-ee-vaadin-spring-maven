package com.udemy.vaadin.views;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path = "/ui")
@Title("Hello")
@Theme("valo")
public class MainView extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout layout = new VerticalLayout();

        layout.addComponent(new Label("Hello World from Vaadin"));
        Button button = new Button("Click me hard");
        layout.addComponent(button);
        button.addClickListener(event -> layout.addComponent(new Label("Harder!")));

        setContent(layout);
    }
}
