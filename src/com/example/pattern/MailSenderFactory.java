package com.example.pattern;

public class MailSenderFactory implements Factory{

	public Sender produce() {
		return new MailSender();
	}

}
