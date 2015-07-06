package com.example.pattern;

public class TrainStationProxyDrive {
	public static void main(String[] args) {
		TrainStation trainStationProxy = new XianTrainStationProxy(new XianTrainStation());
		trainStationProxy.sellTicket();
	}
}
