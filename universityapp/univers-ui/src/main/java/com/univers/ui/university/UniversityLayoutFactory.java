package com.univers.ui.university;

import com.univers.ui.commons.UniversMainUI;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = UniversityLayoutFactory.NAME, ui = UniversMainUI.class)
public class UniversityLayoutFactory extends VerticalLayout implements View {

    public static final String NAME = "operations";

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        addComponent(new Label("University layout..."));
    }
}
