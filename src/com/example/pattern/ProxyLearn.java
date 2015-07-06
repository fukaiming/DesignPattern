package com.example.pattern;

public class ProxyLearn {
	public static void main(String[] args) {
		ProxyImpl proxy = new ProxyImpl(new BalanceImpl());
		Balance balanceProxy = (Balance) proxy.bind();
		balanceProxy.updateBalance();
	}
}
