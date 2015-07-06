package com.example.pattern;

public class SmsSenderFactory implements Factory {

	public Sender produce() {
		return new SmsSender();
	}

}
