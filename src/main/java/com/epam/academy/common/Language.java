package com.epam.academy.common;

public enum Language {
    JS(true, true, "Java Script"),
    JAVA(true, false, "Java (Oracle)"),
    KOTLIN(true, false, "Kotlin ('NetBrains')"),
    HTML(false, false, "Hyper Text Markup Language"),
    PYTHON(true, true, "Python (the all in all)");

    private final boolean isProgrammingLanguage;
    private final boolean canUseForScripting;
    private final String qualifiedName;


    Language(boolean isProgrammingLanguage, boolean canUseForScripting, String qualifiedName) {
        this.isProgrammingLanguage = isProgrammingLanguage;
        this.canUseForScripting = canUseForScripting;
        this.qualifiedName = qualifiedName;
    }

    public boolean isProgrammingLanguage() {
        return isProgrammingLanguage;
    }

    public boolean canUseForScripting() {
        return canUseForScripting;
    }

    public String getQualifiedName() {
        return qualifiedName;
    }
}
