package com.udemy.vaadin.views;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Layout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path="/textarea")
@Theme("valo")
public class TextAreaView extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Layout layout = new VerticalLayout();

        TextArea textArea = new TextArea();
        // WordWrap true -> default
        textArea.setWordwrap(true);
        textArea.setValue("This is going to be a very long Text so it will be wrapped. (Maybe)");
        layout.addComponent(textArea);

        TextArea unwrapped = new TextArea();
        unwrapped.setWordwrap(false);
        unwrapped.setValue("This is going to be a very long Text and it will not be wrapped. (Maybe)");
        layout.addComponent(unwrapped);

        setContent(layout);
    }
}
