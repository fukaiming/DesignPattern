package com.example.pattern;


public class MyCommand implements Command {
	private Recevier receiver;
	//ͨ�����캯�������������ߵ�����
	public MyCommand(Recevier receiver){
		this.receiver = receiver;
	}
	
	public void execute() {
		receiver.action();
	}

}
