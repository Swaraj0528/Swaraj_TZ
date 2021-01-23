package com.tz.decorator;

public class VegPizzaDecor extends PizzaDecorator {

	public VegPizzaDecor(Pizza pizza) {
		super(pizza);
		
		
	}
	public void bake() {
		super.bake();
		System.out.println("adding veggie topings");
	}

}
