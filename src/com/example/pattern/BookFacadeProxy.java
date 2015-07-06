package com.example.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//������̬������
public class BookFacadeProxy implements InvocationHandler {
	// ͨ�����캯�����Ŀ����������
	private BookFacade bookFacade;

	public BookFacadeProxy(BookFacade bookFacade) {
		this.bookFacade = bookFacade;
	}

	//������̬����ʵ��
	public Object bind(){
		Object bookFacadeProxy = Proxy.newProxyInstance(bookFacade.getClass().getClassLoader(), bookFacade.getClass().getInterfaces(), this);
		return bookFacadeProxy;
		
	}
	
	//���ô�����
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("����ʼ����");
		method.invoke(bookFacade, args);
		System.out.println("�����������");
		return null;
	}

}
