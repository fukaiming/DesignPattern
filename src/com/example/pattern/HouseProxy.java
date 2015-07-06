package com.example.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HouseProxy implements InvocationHandler {
	private HouseDevelopment houseDevelopment;

	// 通过构造函数获得目标对象（被代理对象）的引用
	public HouseProxy(HouseDevelopment houseDevelopment) {
		this.houseDevelopment = houseDevelopment;
	}
	
	//创建代理实例
	public Object bind(){
		Object proxy = Proxy.newProxyInstance(houseDevelopment.getClass().getClassLoader(),houseDevelopment.getClass().getInterfaces(), this);
		return proxy;
	}
	
	//调用代理方法
	/**
	 * proxy:被代理对象
	 * method：被代理对象的方法
	 * args：方法参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("日志监控开始");
		method.invoke(houseDevelopment, args);//通过反射调用被代理对象的方法
		System.out.println("日志监控结束");
		return null;
	}

}
