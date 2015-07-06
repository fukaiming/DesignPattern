package com.example.pattern;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("use mail to send");
	}

}
