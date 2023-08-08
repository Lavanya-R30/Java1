package com.xworkz.umberalla.app;

public class Umberalla {
<<<<<<< HEAD
	public String color;
=======
public String color;
>>>>>>> 594602b0bcebd378fb69f8e274d9daf25da0635d
	public double price;

	public void rain() {
		System.out.println("invoking rain of no-arg....");
		rain("Yellow");
		rain(299.9);
	}

	public void rain(String color) {
		System.out.println("invoking rain of String..");
		System.out.println("Color :" + color);
	}

	public void rain(double price) {
		System.out.println("invoking rain of double...");
		System.out.println("Price :" + price);
	}

	public void rain(String color, double price) {
		System.out.println("invoking rain of String and double...");
		rain(color);
		rain(price);
	}
}
