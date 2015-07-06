package com.example.pattern;

public interface Iterator {
	//判断是否存在元素
	public boolean hasNext();
	//向后遍历
	public Object next();
	
	//向前遍历
	public Object pre();
}
