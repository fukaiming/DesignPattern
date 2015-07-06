package com.example.pattern;

public class XianTrainStationProxy implements TrainStation {

	private TrainStation trainStation;

	public XianTrainStationProxy(TrainStation trainStation) {
		this.trainStation = trainStation;
	}

	public void sellTicket() {
		System.out.println("��ȡ5ԪǮ������");
		trainStation.sellTicket();
	}

}
