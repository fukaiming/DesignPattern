package com.example.pattern;

/**
 * ����ģʽ ����ģʽ��ʵ������ĵ����ߺ�����Ľ�����֮����
 * 
 */
public class Invoker {
	private Command command;

	// ͨ�����캯�����������������
	public Invoker(Command command) {
		this.command = command;
	}
	
	public void action(){
		command.execute();
	}
}
