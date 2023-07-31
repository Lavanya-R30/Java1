package com.xworkz.hospital.app.boot;

import com.xworkz.hospital.app.Hospital;

public class HosiptalRunner {

	public static void main(String[] args) {

System.out.println("Running main in HospitalRunner");
		
		Hospital hospital=new Hospital();
		
		hospital.provideTreatment();
	}

}
