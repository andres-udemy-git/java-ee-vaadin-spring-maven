package com.univers.ui.commons;

import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class UniversLogoFactory implements UIComponentBuilder {

    @Override
    public Component createComponent() {
        return new LogoLayout();
    }

    private class LogoLayout extends VerticalLayout {

        private static final String PATH_TO_LOGO = "../../images/universe_2.png";

        private Embedded logo;

        public LogoLayout() {
            init();
            addComponent(logo);
            setComponentAlignment(logo, Alignment.MIDDLE_CENTER);
        }

        private void init() {
            logo = new Embedded();

            logo.setSource(new ThemeResource(PATH_TO_LOGO));
            logo.setWidth("398px");
            logo.setHeight("141px");
        }
    }
}
