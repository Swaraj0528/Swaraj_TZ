package com.tz.AbstractFactoryPattern;

public class ProducerAbstractFactory  {

	public static AbstractFactory getProfession(boolean isTrainee) {
		if(isTrainee) {
			return new TraineeProfessionAbstractfactory();
		}
		else {
			return new ProfessionlAbstractFactory();
		}
	}
	
	

}
