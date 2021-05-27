package com.epam.academy.cleanCode;

import com.epam.academy.common.Language;
import com.epam.academy.common.LanguageService;

public class LanguageServiceImpl implements LanguageService{

	@Override
	public boolean isProgrammingLangugage(Language language) {
		return language.isProgrammingLanguage();
	}

	@Override
	public boolean canUseForScripting(Language language) {
		return language.isCanBeUsedForScripting();
	}

	@Override
	public String getQualifiedName(Language language) {
		return language.getFullName();
	}

}
