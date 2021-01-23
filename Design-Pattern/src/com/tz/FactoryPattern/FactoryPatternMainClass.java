package com.tz.FactoryPattern;

public class FactoryPatternMainClass {

	public static void main(String[] args) {
		
		ProfessionFactory pf = new ProfessionFactory();
		Profession profession = pf.getProfession("Engineer");
		profession.profession();
	}

}
