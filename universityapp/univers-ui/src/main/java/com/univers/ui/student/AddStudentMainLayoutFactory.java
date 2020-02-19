package com.univers.ui.student;

import com.univers.model.entity.Student;
import com.univers.utils.student.Gender;
import com.univers.utils.ui.ButtonConstants;
import com.univers.utils.ui.StudentConstants;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.ui.*;

@org.springframework.stereotype.Component
public class AddStudentMainLayoutFactory {

    private class AddStudentMainLayout extends VerticalLayout {

        private TextField firstName;

        private TextField lastName;

        private TextField age;

        private ComboBox gender;

        private Button save;

        private Button clear;

        private BeanFieldGroup<Student> fieldGroup;

        private Student student;

        public AddStudentMainLayout init() {
            fieldGroup = new BeanFieldGroup<>(Student.class);
            firstName = new TextField(StudentConstants.FIRST_NAME.toString());
            lastName = new TextField(StudentConstants.LAST_NAME.toString());
            age = new TextField(StudentConstants.AGE.toString());
            gender = new ComboBox(StudentConstants.GENDER.toString());

            save = new Button(ButtonConstants.SAVE.toString());
            clear = new Button(ButtonConstants.CLEAR.toString());

            gender.addItem(Gender.MALE);
            gender.addItem(Gender.FEMALE);
            gender.addItem(Gender.DIVERSE);

            return this;
        }

        public AddStudentMainLayout layout() {
            return this;
        }

    }

    public Component build() {
        return new AddStudentMainLayout().init().layout();
    }
}
