package com.xworkz.hotel.boot;
import com.xworkz.hotel.app.Hotel;
import com.xworkz.hotel.app.ShabriHotel;
public class HotelRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in HotelRunner ");

		Hotel hotel = new ShabriHotel();
		hotel.serve();
		System.out.println("**********Child ref**********");
		ShabriHotel shabriHotel = new ShabriHotel();
		shabriHotel.serve();

	}

	}
