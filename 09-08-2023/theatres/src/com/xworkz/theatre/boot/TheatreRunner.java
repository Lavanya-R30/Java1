package com.xworkz.theatre.boot;

import com.xworkz.theatre.app.NavarangTheater;
import com.xworkz.theatre.app.Theatre;

public class TheatreRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in TheaterRunner");

		NavarangTheater theater = new NavarangTheater();
		theater.display();
		System.out.println("*********Child ref**********");
		NavarangTheater navarangTheater = new NavarangTheater();
		navarangTheater.display();

	

	}

}
