package com.udemy.vaadin.views;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@SpringUI(path = "/tabsheet")
@Theme("valo")
public class TabSheetView extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Layout layout = new HorizontalLayout();
        layout.setWidth("100%");

        TabSheet tabs = new TabSheet();
        tabs.setWidth("75%");

        Layout tabLayout1 = new HorizontalLayout();
        tabLayout1.addComponent(new Label("This is Layout 1"));
        tabs.addTab(tabLayout1, "Layout1");

        Layout tabLayout2 = new HorizontalLayout();
        tabLayout2.addComponent(new Label("This is Layout 2"));
        tabs.addTab(tabLayout2, "Layout2");

        layout.addComponent(tabs);
        ((HorizontalLayout)layout).setComponentAlignment(tabs, Alignment.TOP_CENTER);
        setContent(layout);
    }
}
