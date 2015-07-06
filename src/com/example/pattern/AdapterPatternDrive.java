package com.example.pattern;

public class AdapterPatternDrive {
	public static void main(String[] args) {
		ThreePlugInterface threePlug = new TwoPlugAdapter(new TwoPlug());
		threePlug.charge();
	}
}
