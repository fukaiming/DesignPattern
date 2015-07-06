package com.example.pattern;

public class CoffeeWithSugar implements DrinkInterface {
	private DrinkInterface drink;
	//通过构造函数获得本体组件的引用
	public CoffeeWithSugar(DrinkInterface drink){
		this.drink = drink;
	}
	
	//装饰对象的drink方法
	public void drink() {
		drink.drink();
		System.out.println("put some sugar into coffee");
	}

}
