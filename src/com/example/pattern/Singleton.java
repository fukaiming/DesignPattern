package com.example.pattern;

//����ģʽ
public class Singleton {
	// step1:����һ����static���εĵ�������ʾ��������Ψһ�ĵ���
	private static Singleton singleton;

	// step2:��private���ι��캯������ֹ�ⲿʵ����
	private Singleton() {

	}

	// step3:�ṩһ���������ڻ��ʵ��
	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public void info(){
		System.out.println("I have get a singleton");
	}
}
