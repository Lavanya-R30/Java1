package com.xworkz.showroom.util.app;

public class ShowRoomUtil {
public static void run(ShowRoom showroom) {
		
		System.out.println("Showroom Location:"+showroom.location);
		showroom.service();
		
		if( showroom instanceof WatchShowRoom) 
		{
			System.out.println("Accessing WatchShowroom");
			WatchShowRoom watch=(WatchShowRoom)showroom;
			
			System.out.println("Watch Showroom name: "+watch.name);
			watch.sell();
		}

		

		if( showroom instanceof MobileShowroom) 
		{
			System.out.println("Accessing MobileShowroom");
			MobileShowroom mobile=(MobileShowroom)showroom;
			System.out.println("Number of shops: "+mobile.noOfShops);
			
			mobile.support();
		}
		
		
		
		
		
	}
}
