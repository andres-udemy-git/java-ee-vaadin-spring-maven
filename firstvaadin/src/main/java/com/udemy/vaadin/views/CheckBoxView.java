package com.udemy.vaadin.views;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

import java.util.ArrayList;
import java.util.List;

@SpringUI(path="/checkbox")
@Theme("valo")
public class CheckBoxView extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Layout layout = new HorizontalLayout();

        List<CheckBox> boxes = new ArrayList<>();

        boxes.add(new CheckBox("Cheese"));
        boxes.add(new CheckBox("Mushrooms"));
        boxes.add(new CheckBox("Ananas"));

        boxes.forEach(box -> layout.addComponent(box));

        Button button = new Button("Submit");
        button.addClickListener(event -> {
            List<String> choice = new ArrayList<>();
            for (CheckBox box : boxes) {
                if (box.getValue())
                    choice.add(box.getCaption());
            }
            String message = "You want";
            if (choice.size() > 0) {
                for (int i = 0; i < choice.size(); i++) {
                    if (i == 0) {
                        message += " " + choice.get(i);
                    } else if (i == choice.size() - 1) {
                        message += " and " + choice.get(i);
                    }
                    else {
                        message += ", " + choice.get(i);
                    }
                }
            } else {
                message += " nothing!";
            }
            Notification.show(message);
        });

        layout.addComponent(button);

        setContent(layout);
    }
}
