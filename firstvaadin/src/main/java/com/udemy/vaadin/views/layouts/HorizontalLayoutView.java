package com.udemy.vaadin.views.layouts;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

@SpringUI(path = "/layouts/horizontal")
@Title("Horizontal Layout")
@Theme("valo")
public class HorizontalLayoutView extends UI {

    @Override
    protected void init(VaadinRequest request) {
        HorizontalLayout layout = new HorizontalLayout();
        layout.setWidth("100%");

        Button b1 = new Button("First");
        b1.setWidth("100%");
        Button b2 = new Button("Second");
        b2.setWidth("100%");

        layout.addComponent(b1);
        layout.addComponent(b2);
        layout.addComponent(new Button("Third"));
        layout.setExpandRatio(b1, 1);
        layout.setExpandRatio(b2, 2);

        setContent(layout);
    }
}
