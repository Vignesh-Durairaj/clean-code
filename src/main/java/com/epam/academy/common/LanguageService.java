package com.epam.academy.common;

public interface LanguageService {

	public boolean isProgrammingLangugage(Language language);
	public boolean canUseForScripting(Language language); 
	public String getQualifiedName(Language language); 
}
