package com.example.pattern;

public class ProxyDrive {
	public static void main(String[] args) {
		Count count = new CountProxy(new CountImpl());
		count.queryCount();
		count.updateCount();
	}
}
