package com.xworkz.elevator.boot;

import com.xworkz.elevator.app.Elevator;

public class ElevatorRunner {

	public static void main(String[] args) {

		Elevator run=new Elevator();
		run.lift();
		System.out.println("\n");
		run.lift("Kaleai",789);
	}
	
}
