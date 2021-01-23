package com.tz.AbstractFactoryPattern;

public class AbsFacPatternMainClass {

	public static void main(String[] args) {

		AbstractFactory absFactroy = ProducerAbstractFactory.getProfession(false);
		Profession p = absFactroy.getProfession("Engineer");
		p.print();
		
		

	}

}
