package com.example.pattern;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("use Sms to send");
	}

}
