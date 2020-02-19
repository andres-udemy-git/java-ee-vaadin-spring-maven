package com.univers.ui.commons;

import com.google.gwt.thirdparty.guava.common.base.Strings;
import com.univers.ui.navigator.UniversNavigator;
import com.vaadin.data.Property;
import com.vaadin.ui.Component;
import com.vaadin.ui.Tree;
import com.vaadin.ui.VerticalLayout;

import com.univers.utils.ui.MenuConstants;

@org.springframework.stereotype.Component
public class UniversMenuFactory implements UIComponentBuilder {

    @Override
    public Component createComponent() {
        return new UniversMenu().init().layout();
    }

    private class UniversMenu extends VerticalLayout implements Property.ValueChangeListener {

        private Tree mainMenu;

        public UniversMenu init() {
            mainMenu = new Tree();
            mainMenu.addValueChangeListener(this);
            return this;
        }

        public UniversMenu layout() {
            setWidth("100%");
            setHeightUndefined();

            mainMenu.addItem(MenuConstants.STUDENT);
            mainMenu.addItem(MenuConstants.UNIVERSITY);

            mainMenu.addItem(MenuConstants.ADD_STUDENT);
            mainMenu.addItem(MenuConstants.REMOVE_STUDENT);
            mainMenu.setChildrenAllowed(MenuConstants.ADD_STUDENT, false);
            mainMenu.setChildrenAllowed(MenuConstants.REMOVE_STUDENT, false);
            mainMenu.setParent(MenuConstants.ADD_STUDENT, MenuConstants.STUDENT);
            mainMenu.setParent(MenuConstants.REMOVE_STUDENT, MenuConstants.STUDENT);

            mainMenu.addItem(MenuConstants.UNIVERSITY_OPERATIONS);
            mainMenu.setChildrenAllowed(MenuConstants.UNIVERSITY_OPERATIONS, false);
            mainMenu.setParent(MenuConstants.UNIVERSITY_OPERATIONS, MenuConstants.UNIVERSITY);

            mainMenu.expandItem(MenuConstants.STUDENT);
            mainMenu.expandItem(MenuConstants.UNIVERSITY);

            addComponent(mainMenu);

            return this;
        }

        @Override
        public void valueChange(Property.ValueChangeEvent event) {
            String path = event.getProperty().getValue().toString();

            if (!Strings.isNullOrEmpty(path)) {
                path = path.toLowerCase().replaceAll("\\s", "");
                UniversNavigator.navigate(path);
            }
        }
    }
}
