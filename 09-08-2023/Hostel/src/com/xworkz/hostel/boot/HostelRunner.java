package com.xworkz.hostel.boot;

import com.xworkz.hostel.app.BCMHostel;
import com.xworkz.hostel.app.Hostel;

public class HostelRunner {

	public static void main(String[] args) {


		System.out.println("invoking main in Hostelr");

		BCMHostel hostel = new BCMHostel();
		hostel.addStudent();
		System.out.println("***********Child ref***************");
		BCMHostel  hostel1 = new BCMHostel();
	    hostel1.addStudent();

	}

}
