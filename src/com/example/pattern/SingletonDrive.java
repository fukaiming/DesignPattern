package com.example.pattern;

public class SingletonDrive {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.info();
	}
}
