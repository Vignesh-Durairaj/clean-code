package com.epam.academy.uglyCode.service;

import com.epam.academy.common.Language;
import com.epam.academy.common.LanguageService;


public final class LanguageServiceImpl implements LanguageService {

    @Override
    public boolean isProgrammingLanguage(Language language) {
        return language.isProgrammingLanguage();
    }

    @Override
    public boolean canUseForScripting(Language language) {
        return language.canUseForScripting();
    }

    @Override
    public String getQualifiedName(Language language) {
       return language.getQualifiedName();
    }
}
