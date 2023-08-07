package com.xworkz.specs.boot;

import com.xworkz.specs.app.Specs;
public class SpecsRunner {

		public static void main(String[] args) {
			Specs spec= new Specs();
			spec.lens();
			System.out.println("\n");
			spec.lens(1.5);
			spec.lens("concave");

								

	}

}
