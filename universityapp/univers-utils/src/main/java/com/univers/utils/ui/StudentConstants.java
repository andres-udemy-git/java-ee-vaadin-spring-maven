package com.univers.utils.ui;

public enum StudentConstants {

    MAIN_MENU("MAIN MENU"),
    SHOW_STUDENTS("SHOW STUDENTS"),
    FIRST_NAME("First Name"),
    LAST_NAME("Last Name"),
    AGE("Age"),
    GENDER("Gender");

    private final String value;

    private StudentConstants(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
