package com.tz.FactoryPattern;

public class ProfessionFactory  {
	
	public Profession getProfession(String typeofProfession) {
		
		if(typeofProfession== null) {
			return null;
			
		}else if (typeofProfession.equalsIgnoreCase("Docter")) {
			return new Docter();
		}else if (typeofProfession.equalsIgnoreCase("Engineer")) {
			return new Engineer();
		}else if (typeofProfession.equalsIgnoreCase("Teacher")) {
			return new Teacher();
		}
		
		return null;
		
	}

}
