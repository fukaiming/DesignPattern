package com.example.pattern;

public interface Subject {
	//注册观察者
	public void registerObserver(Observer observer);
	//删除观察者
	public void delObserver(Observer observer);
	//通知观察者
	public void notifyAllObserver();
}
