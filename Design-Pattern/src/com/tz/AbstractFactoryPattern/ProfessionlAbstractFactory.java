package com.tz.AbstractFactoryPattern;

public class ProfessionlAbstractFactory extends AbstractFactory{
	
	Profession getProfession(String profession) {
		
		if(profession==null) {
			return null;
		}else if (profession.equalsIgnoreCase("Teacher")){
			return new Teacher();
		}else if (profession.equalsIgnoreCase("Engineer")){
			return new Engineer();
		}
		
		return null;
	}

}
