
package com.xworkz.gadget.boot;


import com.xworkz.gadget.app.Gadget;

public class GadgetRunner {

	public static void main(String[] args) {


			Gadget product =new Gadget();
			product.item();
			System.out.println("\n");
			product.item("Laptop",48000);

		

	}

}
