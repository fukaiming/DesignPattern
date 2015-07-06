package com.example.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends Beverage {

	public void addSource() {
		System.out.println("ÃÌº”≤Ë“∂");
	}
	
	public boolean customerWantsSugar() {
		return getUserInput();
	}

	private boolean getUserInput() {
		String answer = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("would you want some sugar?(y/n)");
		try {
			answer = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(answer.equalsIgnoreCase("y")){
			return true;
		}else{
			return false;
		}
	}

}
