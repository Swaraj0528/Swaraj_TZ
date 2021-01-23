package com.tz.decorator;

public class ChessPizzaDecor  extends PizzaDecorator {

	
	
	public ChessPizzaDecor(Pizza pizza) {
		super(pizza);
	}
	
	public void bake() {
		super.bake();
		System.out.println("adding Chesse topings");
	}
}


