package com.example.pattern;

public class SenderFactoryDrive {
	public static void main(String[] args) {
			Sender sender = SendFactory.produceSender("mail");
			sender.send();
	}
}
