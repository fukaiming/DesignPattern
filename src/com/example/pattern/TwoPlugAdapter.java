package com.example.pattern;

public class TwoPlugAdapter implements ThreePlugInterface {
	private TwoPlugInterface twoPlug;

	// 通过构造函数获得两相插头的引用
	public TwoPlugAdapter(TwoPlugInterface twoPlug) {
		this.twoPlug = twoPlug;
	}
	
	//实现三相插头充电的功能
	public void charge() {
		System.out.println("将二项插头转化成三相插头");
		twoPlug.charge();
		System.out.println("使用三相插头充电");
	}

}
