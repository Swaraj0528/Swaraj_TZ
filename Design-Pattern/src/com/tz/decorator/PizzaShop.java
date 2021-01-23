package com.tz.decorator;

public class PizzaShop {

	public static void main(String[] args) {

		Pizza pizza = new VegPizzaDecor(new ChessPizzaDecor( new PlainPizza()));
		pizza.bake();
		
	}

}
