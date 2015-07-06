package com.example.pattern;

public class DecoratorDrive {

	public static void main(String[] args) {
		DrinkInterface drink = new CoffeeWithCappuccino(new CoffeeWithSugar(new Coffee()));
		drink.drink();
	}
}
