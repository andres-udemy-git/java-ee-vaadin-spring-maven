package com.udemy.vaadin.views;

import com.udemy.vaadin.model.Person;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@SpringUI(path = "/data-binding")
@Title("Data Binding")
@Theme("valo")
public class DataBindingView extends UI {

    private TextField nameField;

    private TextField ageField;

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);

        nameField = new TextField("Name");
        nameField.setNullRepresentation("");
        ageField = new TextField("Age");
        ageField.setNullRepresentation("");

        Person person = new Person();
        BeanFieldGroup<Person> fieldGroup = new BeanFieldGroup<>(Person.class);

        fieldGroup.bind(nameField, "name");
        fieldGroup.bind(ageField, "age");
        fieldGroup.setItemDataSource(person);

        Button submitButton = new Button("Submit");
        submitButton.addClickListener(event -> {
            try {
                fieldGroup.commit();
            } catch (FieldGroup.CommitException e) {
                Notification.show(e.getMessage(), Notification.Type.ERROR_MESSAGE);
            } finally {
                Notification.show(person.toString());
            }
        });

        layout.addComponent(nameField);
        layout.addComponent(ageField);
        layout.addComponent(submitButton);

        setContent(layout);
    }
}
