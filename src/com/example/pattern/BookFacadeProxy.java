package com.example.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//创建动态代理类
public class BookFacadeProxy implements InvocationHandler {
	// 通过构造函数获得目标对象的引用
	private BookFacade bookFacade;

	public BookFacadeProxy(BookFacade bookFacade) {
		this.bookFacade = bookFacade;
	}

	//创建动态代理实例
	public Object bind(){
		Object bookFacadeProxy = Proxy.newProxyInstance(bookFacade.getClass().getClassLoader(), bookFacade.getClass().getInterfaces(), this);
		return bookFacadeProxy;
		
	}
	
	//调用代理方法
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("事务开始操作");
		method.invoke(bookFacade, args);
		System.out.println("事务结束操作");
		return null;
	}

}
