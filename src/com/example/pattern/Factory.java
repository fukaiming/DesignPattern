package com.example.pattern;

//定义一个工厂接口
public interface Factory {
	//用于生产Sender实例
	public Sender produce();
}
