package com.example.pattern;

/**
 * 命令模式 命令模式：实现命令的调用者和命令的接收者之间解耦。
 * 
 */
public class Invoker {
	private Command command;

	// 通过构造函数获得命令对象的引用
	public Invoker(Command command) {
		this.command = command;
	}
	
	public void action(){
		command.execute();
	}
}
