package com.example.pattern;

public interface Subject {
	//ע��۲���
	public void registerObserver(Observer observer);
	//ɾ���۲���
	public void delObserver(Observer observer);
	//֪ͨ�۲���
	public void notifyAllObserver();
}
