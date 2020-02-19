package com.udemy.vaadin.views;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI(path = "/label")
@Title("Hello")
@Theme("valo")
public class LabelView extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        HorizontalLayout layout = new HorizontalLayout();
        layout.addComponent(new Label("<b>Hello</b> World", ContentMode.HTML));
        setContent(layout);
    }
}
