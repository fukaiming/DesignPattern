package com.example.pattern;

public abstract class Beverage {
	public final void makeBeverage(){
		//step1：将水煮沸
		boilWater();
		//step2:将水倒入杯中
		pourIntoCup();
		//step3:加入原料
		addSource();
		//step4:是否加糖
		if(customerWantsSugar()){
			addSugar();
		}
	}
	
	private void addSugar() {
		System.out.println("添加糖");
	}

	public boolean customerWantsSugar() {
		return true;
	}

	

	public boolean isAddSugar() {
		return true;
	}

	


	public abstract void addSource();
		

	private void pourIntoCup() {
		System.out.println("将水倒入杯中");
	}

	private void boilWater() {
		System.out.println("将水煮沸");
	}
	
}
