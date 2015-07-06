package com.example.pattern;

public class CoffeeWithCappuccino implements DrinkInterface {

	private DrinkInterface drink;

	public CoffeeWithCappuccino(DrinkInterface drink) {
		this.drink = drink;
	}

	public void drink() {	
		drink.drink();
		System.out.println("put cappuccino into coffee");
	}

}
