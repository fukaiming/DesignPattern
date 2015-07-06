package com.example.pattern;

public class TwoPlugAdapter implements ThreePlugInterface {
	private TwoPlugInterface twoPlug;

	// ͨ�����캯����������ͷ������
	public TwoPlugAdapter(TwoPlugInterface twoPlug) {
		this.twoPlug = twoPlug;
	}
	
	//ʵ�������ͷ���Ĺ���
	public void charge() {
		System.out.println("�������ͷת���������ͷ");
		twoPlug.charge();
		System.out.println("ʹ�������ͷ���");
	}

}
