package com.xworkz.mouse.app;

public class Mouse {

		public String brand;
		public int price;


		
	public  void mouse() {
		System.out.println("Invoking main method of mouse");
		mouse("Dell Ms");
		mouse(500);


	}
	public void mouse(String brand) {
		System.out.println("Invoking the main mouse brand");
		System.out.println("brand:"+brand);
	}

	public void mouse(int price) {
		System.out.println("Invoking the main mouse price");
		System.out.println("price:"+price);
	}


	public void mouse(String brand,int price) {

		System.out.println("Invoking the main mouse ");

	   mouse(brand);
	   mouse(price);

	}
}
