package com.epam.academy.common;

public enum Language {
    JS("Java Script"),
    JAVA("Java (Oracle)"),
    KOTLIN("Kotlin ('NetBrains')"),
    HTML("Hyper Text Markup Language"),
    PYTHON("Python (the all in all)");

    private String label;

    Language() {
    }

    Language(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
