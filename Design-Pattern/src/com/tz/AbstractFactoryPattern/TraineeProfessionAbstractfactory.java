package com.tz.AbstractFactoryPattern;

public class TraineeProfessionAbstractfactory extends AbstractFactory {
	
	Profession getProfession(String profession) {
		if(profession == null) {
			return  null;
			
		}else if(profession.equalsIgnoreCase("Engineer")){
			return new TraineeEngineer();
		}else if(profession.equalsIgnoreCase("Teacher")){
			return new TraineeTeacher();
		}
		
		return null;
	}

}
