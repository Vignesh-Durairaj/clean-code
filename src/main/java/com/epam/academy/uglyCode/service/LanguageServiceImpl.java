package com.epam.academy.uglyCode.service;

import com.epam.academy.common.Language;
import com.epam.academy.common.LanguageService;

import java.security.InvalidParameterException;

import static com.epam.academy.common.Language.HTML;
import static com.epam.academy.common.Language.JS;
import static com.epam.academy.common.Language.PYTHON;


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
        if (language.getLabel() == null) {
            throw new InvalidParameterException(String.format("Language %s is not defined",
                        language.name()));
        } else {
            return language.getLabel();
        }
    }
}
