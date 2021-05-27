package com.epam.academy.uglyCode.service;

import static com.epam.academy.common.Language.HTML;
import static com.epam.academy.common.Language.JS;
import static com.epam.academy.common.Language.PYTHON;

import java.security.InvalidParameterException;

import com.epam.academy.common.Language;
import com.epam.academy.common.LanguageService;

public final class LanguageServiceImpl implements LanguageService{

	@Override
	public boolean isProgrammingLangugage(Language language) {
		if (language == HTML) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean canUseForScripting(Language language) {
		if (language == JS || language == PYTHON) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String getQualifiedName(Language language) {
		switch(language) {
		case JS:
			return "Java Script";
		case JAVA:
			return "Java (Oracle)";
		case KOTLIN:
			return "Kotlin ('NetBrains')";
		case HTML:
			return "Hyper Text Markup Language";
		case PYTHON:
			return "Python (the all in all)";
		}
		
		throw new InvalidParameterException(String.format("Language %s is not defined", language.name()));
	}
}
