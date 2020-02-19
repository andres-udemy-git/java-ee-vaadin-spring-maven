package com.univers.utils.ui;

public enum ButtonConstants {

    SAVE("Save"),
    CLEAR("Clear");

    private final String value;

    private ButtonConstants(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
