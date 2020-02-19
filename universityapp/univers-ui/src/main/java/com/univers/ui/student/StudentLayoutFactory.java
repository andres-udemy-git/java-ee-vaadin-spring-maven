package com.univers.ui.student;

import com.univers.ui.commons.UniversMainUI;
import com.univers.utils.ui.StudentConstants;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = StudentLayoutFactory.NAME, ui = UniversMainUI.class)
public class StudentLayoutFactory extends VerticalLayout implements View {

    public static final String NAME = "addstudent";

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        removeAllComponents();
        addLayout();
    }

    private void addLayout() {
        setMargin(true);

        TabSheet tabSheet = new TabSheet();
        tabSheet.setWidth("100%");

        Component addStudentMainTab = new Label("First Tab Content...");
        Component showStudentsTab = new Label("Show Students Tab...");

        tabSheet.addTab(addStudentMainTab, StudentConstants.MAIN_MENU.toString());
        tabSheet.addTab(showStudentsTab, StudentConstants.SHOW_STUDENTS.toString());

        addComponent(tabSheet);
    }
}
