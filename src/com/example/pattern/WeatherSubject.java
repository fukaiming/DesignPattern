package com.example.pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {
	//����һ��List��������еĹ۲���
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void registerObserver(Observer observer) {
		if(observer != null){
			observers.add(observer);
		}
	}

	public void delObserver(Observer observer) {
		if(observers.indexOf(observer) !=-1){
			observers.remove(observer);
		}
	}

	public void notifyAllObserver() {
		for(Observer observer : observers){
			observer.update();
		}
	}

}
