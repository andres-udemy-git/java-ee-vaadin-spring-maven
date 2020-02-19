package com.univers.utils.ui;

public enum MenuConstants {

    UNIVERSITY("UNIVERSITY"),
    UNIVERSITY_OPERATIONS("Operations"),
    STUDENT("STUDENT"),
    ADD_STUDENT ("Add Student"),
    REMOVE_STUDENT("Remove Student");

    private String value;

    private MenuConstants(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
