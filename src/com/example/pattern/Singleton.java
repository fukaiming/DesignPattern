package com.example.pattern;

//单例模式
public class Singleton {
	// step1:定义一个用static修饰的单例，表示整个类中唯一的单例
	private static Singleton singleton;

	// step2:用private修饰构造函数，防止外部实例化
	private Singleton() {

	}

	// step3:提供一个方法用于获得实例
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
