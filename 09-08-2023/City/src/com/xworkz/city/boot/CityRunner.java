package com.xworkz.city.boot;

import com.xworkz.city.app.City;
import com.xworkz.city.app.ShimogaCity;

public class CityRunner {

		public static void main(String[] args) {
			System.out.println("invoking main in CityRunner");

			ShimogaCity city = new ShimogaCity();
			city.welcome();
			System.out.println("***********Child ref***************");
			ShimogaCity city1 = new ShimogaCity();
		    city1.welcome();

		}

	}


