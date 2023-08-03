package com.xworkz.showroom.util.app;

public class ShowRoomRunner {
public static void main(String[] args) {
		
		System.out.println("Running main ShowroomRunner");

		// Showroom showroom=new Showroom();

		WatchShowRoom watchShowroom = new WatchShowRoom();

		MobileShowroom mobileShowroom = new MobileShowroom();

		// ShowroomUtil.run(showroom);
		ShowRoomUtil.run(watchShowroom);
		System.out.println("***************************");
		ShowRoomUtil.run(mobileShowroom);

	}

}
