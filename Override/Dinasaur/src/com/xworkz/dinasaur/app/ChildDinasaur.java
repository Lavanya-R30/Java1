package com.xworkz.dinasaur.app;

public class ChildDinasaur extends Dinasaur{

		@Override
		public void makeSound() {
			System.out.println("inovoking makesound() in ChildDinasaur");
			super.makeSound();
		}


	}


