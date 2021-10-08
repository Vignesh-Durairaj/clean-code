package com.epam.academy;

import com.epam.academy.common.Language;
import com.epam.academy.common.LanguageService;
import com.epam.academy.uglyCode.service.LanguageServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static com.epam.academy.common.Language.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LanguageServiceTest {
    private final Language language;
    private final boolean isProgrammingLanguage;
    private final boolean canBeUsedForScripting;
    private final String fullName;
    private final LanguageService languageService;

    public LanguageServiceTest(Language language, boolean isProgrammingLanguage,
                               boolean canBeUsedForScripting, String fullName) {
        languageService = new LanguageServiceImpl();
        this.language = language;
        this.isProgrammingLanguage = isProgrammingLanguage;
        this.canBeUsedForScripting = canBeUsedForScripting;
        this.fullName = fullName;
    }

    @Parameters(name = "Language : {0}")
    public static Collection<Object[]> params() {
        return Arrays.asList(new Object[][]{
                {HTML, false, false, "Hyper Text Markup Language"},
                {JAVA, true, false, "Java (Oracle)"},
                {KOTLIN, true, false, "Kotlin ('NetBrains')"},
                {PYTHON, true, true, "Python (the all in all)"},
                {JS, true, true, "Java Script"},
        });
    }

    @Test
    public void testIsProgrammingLanguage() {
        assertEquals(isProgrammingLanguage, languageService.isProgrammingLanguage(language));
    }

    @Test
    public void testCanBeUsedForScripting() {
        assertEquals(canBeUsedForScripting, languageService.canUseForScripting(language));
    }

    @Test
    public void testFullyQualifiedNameForLanguage() {
        assertEquals(fullName, languageService.getQualifiedName(language));
    }
}
