package com.epam.academy.common;

public interface LanguageService {
    boolean isProgrammingLanguage(Language language);
    boolean canUseForScripting(Language language);
    String getQualifiedName(Language language);
}
