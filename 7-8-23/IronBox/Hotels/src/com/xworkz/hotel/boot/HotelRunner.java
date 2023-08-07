package com.xworkz.hotel.boot;

import com.xworkz.hotel.app.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		Hotel hotels= new Hotel();
		hotels.hotel();
		System.out.println("\n");
		hotels.hotel("Padma",90);

		
		
	}
}
