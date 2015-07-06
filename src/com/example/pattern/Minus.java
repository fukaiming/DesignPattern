package com.example.pattern;

public class Minus implements ICalculate {

	public int calculate(String exp, String opt) {
		String[] exps = exp.split(opt);
		int num1 = Integer.parseInt(exps[0]);
		int num2 = Integer.parseInt(exps[1]);
		return num1-num2;
	}

}
