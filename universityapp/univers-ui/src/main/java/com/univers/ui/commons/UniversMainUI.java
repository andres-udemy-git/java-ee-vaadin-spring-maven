package com.univers.ui.commons;

import com.univers.ui.navigator.UniversNavigator;
import com.univers.ui.student.StudentLayoutFactory;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@SpringUI(path = UniversMainUI.NAME)
@Title("U n i v e r s")
@Theme("valo")
public class UniversMainUI extends UI {

    public static final String NAME = "/ui";

    private Panel changePanel = new Panel();

    @Autowired
    private UniversLogoFactory logoFactory;

    @Autowired
    private UniversMenuFactory menuFactory;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private SpringViewProvider provider;

    @Override
    protected void init(VaadinRequest request) {
        changePanel.setHeight("100%");

        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();

        Panel contentPanel = new Panel();
        Panel logoPanel = new Panel();

        contentPanel.setWidth("75%");
        contentPanel.setHeight("100%");

        logoPanel.setWidth("75%");
        logoPanel.setHeightUndefined();

        HorizontalLayout uiLayout = new HorizontalLayout();
        uiLayout.setSizeFull();
        uiLayout.setMargin(true);

        Component logo = logoFactory.createComponent();
        Component menu = menuFactory.createComponent();

        uiLayout.addComponent(menu);
        uiLayout.addComponent(changePanel);

        uiLayout.setComponentAlignment(changePanel, Alignment.TOP_CENTER);
        uiLayout.setExpandRatio(changePanel, 3);
        uiLayout.setComponentAlignment(menu, Alignment.TOP_LEFT);
        uiLayout.setExpandRatio(menu, 1);

        logoPanel.setContent(logo);
        contentPanel.setContent(uiLayout);

        layout.addComponent(logoPanel);
        layout.addComponent(contentPanel);

        layout.setComponentAlignment(contentPanel, Alignment.MIDDLE_CENTER);
        layout.setExpandRatio(contentPanel, 1);
        layout.setComponentAlignment(logoPanel, Alignment.TOP_CENTER);

        initNavigator();

        setContent(layout);
    }

    private void initNavigator() {
        UniversNavigator navigator = new UniversNavigator(this, changePanel);
        applicationContext.getAutowireCapableBeanFactory().autowireBean(navigator);
        navigator.addProvider(provider);
        navigator.navigateTo(StudentLayoutFactory.NAME);
    }
}
