package com.example.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HouseProxy implements InvocationHandler {
	private HouseDevelopment houseDevelopment;

	// ͨ�����캯�����Ŀ����󣨱�������󣩵�����
	public HouseProxy(HouseDevelopment houseDevelopment) {
		this.houseDevelopment = houseDevelopment;
	}
	
	//��������ʵ��
	public Object bind(){
		Object proxy = Proxy.newProxyInstance(houseDevelopment.getClass().getClassLoader(),houseDevelopment.getClass().getInterfaces(), this);
		return proxy;
	}
	
	//���ô�����
	/**
	 * proxy:���������
	 * method�����������ķ���
	 * args����������
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("��־��ؿ�ʼ");
		method.invoke(houseDevelopment, args);//ͨ��������ñ��������ķ���
		System.out.println("��־��ؽ���");
		return null;
	}

}
