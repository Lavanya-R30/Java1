package com.xworkz.policestation.boot;

import com.xworkz.policestation.app.PoliceStation;
import com.xworkz.policestation.app.TrafficPolice;
public class PoliceStationRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in PoliceStationRunner");

		PoliceStation policeStation = new PoliceStation();
		policeStation.arrest();
		System.out.println("*********Child ref**********");

		PoliceStation traficPoliceStation = new PoliceStation();
		traficPoliceStation.arrest();

	
	}

}
