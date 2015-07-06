package com.example.pattern;

public class ICalculateDrive {
	public static void main(String[] args) {
		String exp = "2+8";
		ICalculate iCalculate = new Plus();
		int result = iCalculate.calculate(exp, "\\+");
		System.out.println(exp+"="+result);
				
				
	}
}
