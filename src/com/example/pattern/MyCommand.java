package com.example.pattern;


public class MyCommand implements Command {
	private Recevier receiver;
	//通过构造函数获得命令接收者的引用
	public MyCommand(Recevier receiver){
		this.receiver = receiver;
	}
	
	public void execute() {
		receiver.action();
	}

}
