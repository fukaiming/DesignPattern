package com.example.pattern;

public class CountProxy implements Count {
	public Count count;

	// ͨ�����캯�����Ŀ����������
	public CountProxy(Count count) {
		this.count = count;
	}

	public void queryCount() {
		System.out.println("�������������β");
		count.queryCount();
		System.out.println("�������������β");
	}

	public void updateCount() {
		System.out.println("������־����");
		count.updateCount();
		System.out.println("������־��������");
	}

}
