package com.udemy.vaadin.views.layouts;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

@SpringUI(path = "/layouts/grid")
@Title("Grid Layout")
@Theme("valo")
public class GridLayoutView extends UI {

    @Override
    protected void init(VaadinRequest request) {
        GridLayout layout = new GridLayout(3,3);

        layout.addComponent(new TextField(), 0, 0);
        layout.addComponent(new Button("Save"), 1, 0);
        layout.addComponent(new Button("Remove"), 2, 0);
        Button rowButton = new Button("New row Button");
        rowButton.setWidth("100%");
        rowButton.setHeight("100%");
        layout.addComponent(rowButton, 0,1,2,1);

        setContent(layout);
    }
}
