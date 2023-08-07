package com.xworkz.ironbox.boot;

import com.xworkz.ironbox.app.IronBox;

public class IronBoxRunner {


	public static void main(String[] args) {
		System.out.println("Invoking main in IronBoxRunner");
		IronBox box=new IronBox();
		box.iron();
		System.out.println("=========================");
		box.iron(346);
		System.out.println("=========================");
		box.iron("Bajaj DX-7");
		System.out.println("=========================");
		
		box.iron(470,"Philips ");

	}



	}


