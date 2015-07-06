package com.example.pattern;

public class Singleton2 {
	
	private Singleton2() {

	}
	
	//ʹ�þ�̬�ڲ�����������
	public static class SingletonFactory {
		public SingletonFactory(){
			System.out.println("create SingletonFactory");
		}
		private static Singleton2 singleton = new Singleton2();
	}
	
	//��ȡ����
	public static Singleton2 getSingleton(){
		return SingletonFactory.singleton;
	}
}
