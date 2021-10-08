package com.epam.academy.uglyCode.service;

import com.epam.academy.common.Language;
import com.epam.academy.common.LanguageService;

import java.security.InvalidParameterException;

import static com.epam.academy.common.Language.*;

public final class LanguageServiceImpl implements LanguageService {

    @Override
    public boolean isProgrammingLanguage(Language language) {
        return language != HTML;
    }

    @Override
    public boolean canUseForScripting(Language language) {
        return language == JS || language == PYTHON;
    }

    @Override
    public String getQualifiedName(Language language) throws InvalidParameterException {
        String qualifiedName;
        switch (language) {
            case JS:
                qualifiedName = "Java Script";
                break;
            case JAVA:
                qualifiedName = "Java (Oracle)";
                break;
            case KOTLIN:
                qualifiedName = "Kotlin ('NetBrains')";
                break;
            case HTML:
                qualifiedName = "Hyper Text Markup Language";
                break;
            case PYTHON:
                qualifiedName = "Python (the all in all)";
                break;
            default:
                throw new InvalidParameterException(String.format("Language %s is not defined",
                        language.name()));
        }
        return qualifiedName;
    }
}
