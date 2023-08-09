package com.xworkz.hosiptal.app.boot;

import com.xworkz.hosiptal.app.ESIHopsital;
import com.xworkz.hosiptal.app.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in HospitalRunner");

		Hospital     hospital = new Hospital();
		hospital.admit();
		System.out.println("*********Child ref**********");
		ESIHopsital esiHospital = new ESIHopsital();
		esiHospital.admit();

	}
	
}
