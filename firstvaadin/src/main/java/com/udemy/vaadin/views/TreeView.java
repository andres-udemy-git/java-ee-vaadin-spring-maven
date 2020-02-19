package com.udemy.vaadin.views;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@SpringUI(path = "/tree")
@Theme("valo")
public class TreeView extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Layout layout = new VerticalLayout();

        Tree tree = new Tree();
        tree.addItem("Hungary");
        tree.addItem("Germany");

        tree.addItem("Budapest");
        tree.setChildrenAllowed("Budapest", false);
        tree.setParent("Budapest", "Hungary");
        tree.addItem("Berlin");
        tree.setChildrenAllowed("Berlin", false);
        tree.setParent("Berlin", "Germany");
        tree.addItem("München");
        tree.setChildrenAllowed("München", false);
        tree.setParent("München", "Germany");

        tree.expandItem("Hungary");
        tree.expandItem("Germany");
        layout.addComponent(tree);

        tree.addValueChangeListener(event -> Notification.show(event.getProperty().getValue().toString()));

        setContent(layout);
    }
}
