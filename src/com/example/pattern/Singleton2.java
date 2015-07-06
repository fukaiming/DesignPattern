package com.example.pattern;

public class Singleton2 {
	
	private Singleton2() {

	}
	
	//使用静态内部类生产单例
	public static class SingletonFactory {
		public SingletonFactory(){
			System.out.println("create SingletonFactory");
		}
		private static Singleton2 singleton = new Singleton2();
	}
	
	//获取单例
	public static Singleton2 getSingleton(){
		return SingletonFactory.singleton;
	}
}
