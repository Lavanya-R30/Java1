package com.xworkz.road.boot;

import com.xworkz.road.app.Road;
import com.xworkz.road.app.RuralRoad;

public class RoadRunner {

	public static void main(String[] args) {

		System.out.println("Running main in RoadRunner");

		Road road=new RuralRoad();
		road.open();
        road.startTraffic();
        road.maintain();
        road.stopTraffic();
        road.close();

        System.out.println(road.getRoadType());
        road.markLanes();
        road.controlTraffic();
        road.construct();
        road.inspect();

	}
	}


