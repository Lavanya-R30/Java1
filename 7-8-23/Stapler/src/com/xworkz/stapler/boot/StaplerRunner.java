package com.xworkz.stapler.boot;
import com.xworkz.stapler.app.Stapler;
public class StaplerRunner {
	public static void main(String[] args) {


	Stapler store=new Stapler();
	store.pin();
	System.out.println("\n");
		store.pin("Hyderon",489);
	}
}
