package com.udemy.vaadin.views.layouts;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

@SpringUI(path = "/layouts/absolute")
@Title("Absolute Layout")
@Theme("valo")
public class AbsoluteLayoutView extends UI {

    @Override
    protected void init(VaadinRequest request) {
        AbsoluteLayout layout = new AbsoluteLayout();

        layout.setWidth("500px");
        layout.setHeight("300px");

        Button button = new Button("Button");

        layout.addComponent(button, "left: 50px; top: 100px");

        setContent(layout);
    }
}
