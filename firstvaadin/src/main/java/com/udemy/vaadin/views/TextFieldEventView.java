package com.udemy.vaadin.views;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@SpringUI(path = "/textfield/event")
@Theme("valo")
public class TextFieldEventView extends UI {

    private static final String LABEL_TEMPLATE = "Number of characters: %d";

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout root = new VerticalLayout();
        final Label label = new Label(String.format(LABEL_TEMPLATE, 0));
        label.setImmediate(true);

        TextField textField = new TextField("Name");
        textField.setTextChangeEventMode(AbstractTextField.TextChangeEventMode.EAGER);
        textField.addTextChangeListener(
                event -> label.setValue(String.format(LABEL_TEMPLATE, event.getText().length()))
        );

        root.addComponent(textField);
        root.addComponent(label);
        setContent(root);
    }
}
