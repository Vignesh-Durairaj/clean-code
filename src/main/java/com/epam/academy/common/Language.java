package com.epam.academy.common;

public enum Language {
	JS (true, true, "Java Script"), 
	JAVA (true, false, "Java (Oracle)"), 
	KOTLIN (true, false, "Kotlin ('NetBrains')"), 
	HTML (false, false, "Hyper Text Markup Language"), 
	PYTHON (true, true, "Python (the all in all)");
	
	boolean isProgrammingLanguage;
	boolean canBeUsedForScripting;
	String fullName;
	
	Language(boolean isProgrammingLanguage,
			 boolean canBeUsedForScripting,
			 String fullName) {
		this.isProgrammingLanguage = isProgrammingLanguage;
		this.canBeUsedForScripting = canBeUsedForScripting;
		this.fullName = fullName;
	}

	public boolean isProgrammingLanguage() {
		return isProgrammingLanguage;
	}

	public boolean isCanBeUsedForScripting() {
		return canBeUsedForScripting;
	}

	public String getFullName() {
		return fullName;
	}
	
	
}
