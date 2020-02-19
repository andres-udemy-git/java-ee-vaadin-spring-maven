package com.udemy.vaadin.views.layouts;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@SpringUI(path = "/layouts/vertical")
@Title("Vertical Layout")
@Theme("valo")
public class VerticalLayoutView extends UI {

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();

        Label l1 = new Label("First line");
        Label l2 = new Label("Second line");
        Label l3 = new Label("Third line");

        // Setzen der Laenge des Labels auf Laenge des Textes, damit das Alginment funktioniert
        l1.setWidthUndefined();
        l2.setWidthUndefined();
        l3.setWidthUndefined();

        layout.addComponent(l1);
        layout.addComponent(l2);
        layout.addComponent(l3);

        layout.setComponentAlignment(l1, Alignment.TOP_LEFT);
        layout.setComponentAlignment(l2, Alignment.MIDDLE_CENTER);
        layout.setComponentAlignment(l3, Alignment.BOTTOM_RIGHT);

        setContent(layout);
    }
}
