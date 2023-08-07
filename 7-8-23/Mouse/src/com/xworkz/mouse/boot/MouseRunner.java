package com.xworkz.mouse.boot;

import com.xworkz.mouse.app.Mouse;

public class MouseRunner {

	public static void main(String[] args) {

		Mouse mouses= new Mouse();
		mouses.mouse();
		System.out.println("\n");
		mouses.mouse("Logitech",1000);


	}

}
