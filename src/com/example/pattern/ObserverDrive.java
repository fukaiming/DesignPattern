package com.example.pattern;

public class ObserverDrive {
	public static void main(String[] args) {
		Subject subject = new WeatherSubject();
		subject.registerObserver(new Observer1());
		subject.registerObserver(new Observer2());
		subject.notifyAllObserver();
	}
}
