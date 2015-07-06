package com.example.pattern;

public class FactoryDrive {
	public static void main(String[] args) {
		Factory factory = new SmsSenderFactory();
		Sender sender = factory.produce();
		sender.send();
				
	}
}
