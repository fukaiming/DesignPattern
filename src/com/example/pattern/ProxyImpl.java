package com.example.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyImpl implements InvocationHandler {
	private Balance balance;
	//ͨ�����캯�����Ŀ����������
	public ProxyImpl(Balance balance){
		this.balance = balance;
	}
	
	//�����������ʵ��
	public Object bind(){
		Object proxy = Proxy.newProxyInstance(balance.getClass().getClassLoader(), balance.getClass().getInterfaces(), this);
		return proxy;
	}
	
	//���ô�����
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("��־������ʼ");
		method.invoke(balance, args);//���ñ��������ķ���
		System.out.println("��־��������");
		return null;
	}

}
