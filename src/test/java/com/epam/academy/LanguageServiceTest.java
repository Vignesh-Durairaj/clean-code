package com.epam.academy;

import static com.epam.academy.common.Language.HTML;
import static com.epam.academy.common.Language.JAVA;
import static com.epam.academy.common.Language.JS;
import static com.epam.academy.common.Language.KOTLIN;
import static com.epam.academy.common.Language.PYTHON;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.epam.academy.common.Language;
import com.epam.academy.common.LanguageService;
import com.epam.academy.uglyCode.service.LanguageServiceImpl;

@RunWith(Parameterized.class)
public class LanguageServiceTest {
	
	private Language language;
	private boolean isProgrammingLanguage;
	private boolean canBeUsedForScripting;
	private String fullName;
	
	private LanguageService languageService = new LanguageServiceImpl();
	
	public LanguageServiceTest(Language language, 
							   boolean isProgrammingLanguage, 
							   boolean canBeUsedForScripting, 
							   String fullName) {
		this.language = language;
		this.isProgrammingLanguage = isProgrammingLanguage;
		this.canBeUsedForScripting = canBeUsedForScripting;
		this.fullName = fullName;
	}
	
	@Parameters(name = "Langauge : {0}")
	public static Collection<Object[]> params() {
		return Arrays.asList(new Object[][] {
			{HTML, false, false, "Hyper Text Markup Language"},
			{JAVA, true, false, "Java (Oracle)"},
			{KOTLIN, true, false, "Kotlin ('NetBrains')"},
			{PYTHON, true, true, "Python (the all in all)"},
			{JS, true, true, "Java Script"},
		});
	}
	
	@Test
	public void testIsProgrammingLanguage() {
		assertTrue(isProgrammingLanguage == languageService.isProgrammingLangugage(language));
	}
	
	@Test
	public void testCanBeUsedForScripting() {
		assertTrue(canBeUsedForScripting == languageService.canUseForScripting(language));
	}
	
	@Test
	public void testFullyQualifiedNameForLanguage() {
		assertEquals(fullName, languageService.getQualifiedName(language));
	}
}
