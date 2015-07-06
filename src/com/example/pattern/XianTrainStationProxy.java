package com.example.pattern;

public class XianTrainStationProxy implements TrainStation {

	private TrainStation trainStation;

	public XianTrainStationProxy(TrainStation trainStation) {
		this.trainStation = trainStation;
	}

	public void sellTicket() {
		System.out.println("收取5元钱手续费");
		trainStation.sellTicket();
	}

}
