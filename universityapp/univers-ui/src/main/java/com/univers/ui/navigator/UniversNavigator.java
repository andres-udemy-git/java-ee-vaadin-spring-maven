package com.univers.ui.navigator;

import com.google.gwt.thirdparty.guava.common.base.Strings;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.SingleComponentContainer;
import com.vaadin.ui.UI;

public class UniversNavigator extends Navigator {

    public UniversNavigator(UI ui, SingleComponentContainer container) {
        super(ui, container);
    }

    public static UniversNavigator getNavigator() {
        return (UniversNavigator)UI.getCurrent().getNavigator();
    }

    public static void navigate(String path) {
        try {
            UniversNavigator.getNavigator().navigateTo(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void navigateTo(String path) {
        super.navigateTo(Strings.nullToEmpty(path));
    }
}
