package com.xworkz.pub.boot;

import com.xworkz.pub.app.Pub;
import com.xworkz.pub.app.SportsPub;

public class PubRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in PubRunner");

		Pub pub = new SportsPub();
		pub.enjoy();
		System.out.println("********Child ref**********");

		SportsPub sportsPub = new SportsPub();
		sportsPub.enjoy();
	

	}

}
