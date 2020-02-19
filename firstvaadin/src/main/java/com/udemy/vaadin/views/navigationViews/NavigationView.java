package com.udemy.vaadin.views.navigationViews;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@SpringUI(path = "/")
@Title("Navigation")
@Theme("valo")
public class NavigationView extends UI {

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();

        Button first = new Button("First");
        Button second = new Button("Second");

        Panel viewPanel = new Panel();

        Navigator navigator = new Navigator(this, viewPanel);
        navigator.addView(FirstView.NAME, new FirstView());
        navigator.addView(SecondView.NAME, new SecondView());

        layout.addComponent(new HorizontalLayout(first, second));
        layout.addComponent(viewPanel);

        navigator.navigateTo(FirstView.NAME);
        first.addClickListener(event -> navigator.navigateTo(FirstView.NAME));
        second.addClickListener(event -> navigator.navigateTo(SecondView.NAME));

        setContent(layout);
    }
}
