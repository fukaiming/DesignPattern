package com.example.pattern;

public class HouseDrive {
	public static void main(String[] args) {
		HouseProxy houseProxy = new HouseProxy(new XianHouseDevelopment());
		HouseDevelopment houseDevelopmentProxy = (HouseDevelopment) houseProxy.bind();//通过动态代理创建代理对象
		houseDevelopmentProxy.sellHouse();
		
	}
}
