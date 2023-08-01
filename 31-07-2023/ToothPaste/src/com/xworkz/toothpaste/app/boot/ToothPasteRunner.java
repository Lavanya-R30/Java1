package com.xworkz.toothpaste.app.boot;

import com.xworkz.toothpaste.app.Company;
import com.xworkz.toothpaste.app.Ingredient;
import com.xworkz.toothpaste.app.ToothPaste;

public class ToothPasteRunner {

	public static void main(String[] args) {

		System.out.println("Running main ToothpasteRunner.....");

		String pasteName = "Dabur Amla";
		String brand = "Dabur";

		Company company = new Company("Dabur Amla", "Mohit Malhotra", "India");

		Ingredient ingredient = new Ingredient("Lavanga", 8.8f, 20);

		Ingredient ingredient1 = new Ingredient("Garlic Powder", 8.10f, 78);

		Ingredient ingredient2 = new Ingredient("Salt", 0.87f, 8);

		Ingredient ingredient3 = new Ingredient("Ginger", 8.40f, 12);

		Ingredient ingredient4 = new Ingredient("Maricha", 11.700f, 38);

		Ingredient[] ingredients = { ingredient, ingredient1, ingredient2, ingredient3, ingredient4 };

		ToothPaste toothpaste = new ToothPaste(pasteName, brand, company, ingredients);
		toothpaste.printInfo();

	}

}
