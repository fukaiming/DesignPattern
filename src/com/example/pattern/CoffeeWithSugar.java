package com.example.pattern;

public class CoffeeWithSugar implements DrinkInterface {
	private DrinkInterface drink;
	//ͨ�����캯����ñ������������
	public CoffeeWithSugar(DrinkInterface drink){
		this.drink = drink;
	}
	
	//װ�ζ����drink����
	public void drink() {
		drink.drink();
		System.out.println("put some sugar into coffee");
	}

}
