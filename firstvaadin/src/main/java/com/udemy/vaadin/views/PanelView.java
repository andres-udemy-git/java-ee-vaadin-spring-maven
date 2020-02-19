package com.udemy.vaadin.views;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI(path = "/panel")
@Title("Panel")
@Theme("valo")
public class PanelView extends UI {

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setHeight("100%");

        Panel panel = new Panel("Login");
        panel.setSizeUndefined();

        layout.addComponent(panel);
        layout.setComponentAlignment(panel, Alignment.TOP_CENTER);

        FormLayout loginLayout = new FormLayout();
        TextField name = new TextField("Name");
        loginLayout.addComponent(name);
        PasswordField password = new PasswordField("Password");
        loginLayout.addComponent(password);

        Button loginButton = new Button("Login");
        loginButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);
        Button signUpButton = new Button("Sign up");
        signUpButton.setStyleName(ValoTheme.BUTTON_PRIMARY);

        loginLayout.addComponent(new HorizontalLayout(loginButton, signUpButton));
        loginLayout.setSizeUndefined();
        loginLayout.setMargin(true);

        panel.setContent(loginLayout);

        setContent(layout);
    }
}
