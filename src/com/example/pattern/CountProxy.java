package com.example.pattern;

public class CountProxy implements Count {
	public Count count;

	// 通过构造函数获得目标对象的引用
	public CountProxy(Count count) {
		this.count = count;
	}

	public void queryCount() {
		System.out.println("进行事物操作收尾");
		count.queryCount();
		System.out.println("进行事物操作收尾");
	}

	public void updateCount() {
		System.out.println("进行日志操作");
		count.updateCount();
		System.out.println("进行日志操作结束");
	}

}
