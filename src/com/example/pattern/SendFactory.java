package com.example.pattern;

public class SendFactory {

	// 用于生产Sender
	public static Sender produceSender(String type) {
		if ("mail".equalsIgnoreCase(type)) {
			return new MailSender();
		} else if ("sms".equalsIgnoreCase(type)) {
			return new SmsSender();
		} else {
			return null;
		}
	}
}
