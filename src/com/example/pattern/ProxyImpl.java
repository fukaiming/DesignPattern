package com.example.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyImpl implements InvocationHandler {
	private Balance balance;
	//通过构造函数获得目标对象的引用
	public ProxyImpl(Balance balance){
		this.balance = balance;
	}
	
	//创建代理对象实例
	public Object bind(){
		Object proxy = Proxy.newProxyInstance(balance.getClass().getClassLoader(), balance.getClass().getInterfaces(), this);
		return proxy;
	}
	
	//调用代理方法
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("日志操作开始");
		method.invoke(balance, args);//调用被代理对象的方法
		System.out.println("日志操作结束");
		return null;
	}

}
