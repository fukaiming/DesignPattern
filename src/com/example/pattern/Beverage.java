package com.example.pattern;

public abstract class Beverage {
	public final void makeBeverage(){
		//step1����ˮ���
		boilWater();
		//step2:��ˮ���뱭��
		pourIntoCup();
		//step3:����ԭ��
		addSource();
		//step4:�Ƿ����
		if(customerWantsSugar()){
			addSugar();
		}
	}
	
	private void addSugar() {
		System.out.println("�����");
	}

	public boolean customerWantsSugar() {
		return true;
	}

	

	public boolean isAddSugar() {
		return true;
	}

	


	public abstract void addSource();
		

	private void pourIntoCup() {
		System.out.println("��ˮ���뱭��");
	}

	private void boilWater() {
		System.out.println("��ˮ���");
	}
	
}
