package com.udemy.vaadin.views.navigationViews;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class FirstView extends VerticalLayout implements View {

    public final static String NAME = "fistView";

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        Label label = new Label("This is the first view");
        addComponent(label);
    }
}
