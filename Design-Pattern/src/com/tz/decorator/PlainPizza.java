package com.tz.decorator;

public class PlainPizza implements Pizza {

	//Concreate component which implemts the componet
	@Override
	public void bake() {
		System.out.println("Baking Plain Pizza");

	}

}
