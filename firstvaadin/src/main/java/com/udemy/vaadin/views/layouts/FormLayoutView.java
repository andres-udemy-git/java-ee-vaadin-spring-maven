package com.udemy.vaadin.views.layouts;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

@SpringUI(path = "/layouts/form")
@Title("Form Layout")
@Theme("valo")
public class FormLayoutView extends UI {

    @Override
    protected void init(VaadinRequest request) {
        FormLayout layout = new FormLayout();

        TextField name = new TextField("Name");
        name.setIcon(FontAwesome.USER);
        TextField address = new TextField("Address");
        address.setIcon(FontAwesome.ROAD);

        layout.addComponent(name);
        layout.addComponent(address);

        setContent(layout);
    }
}
