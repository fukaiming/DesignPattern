package com.example.pattern;

public class HouseDrive {
	public static void main(String[] args) {
		HouseProxy houseProxy = new HouseProxy(new XianHouseDevelopment());
		HouseDevelopment houseDevelopmentProxy = (HouseDevelopment) houseProxy.bind();//ͨ����̬�������������
		houseDevelopmentProxy.sellHouse();
		
	}
}
