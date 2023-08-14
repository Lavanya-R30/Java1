package com.xworkz.person.boot;

import com.xworkz.person.app.Employee;
import com.xworkz.person.app.Person;

public class PersonRunner {

	public static void main(String[] args) {

		System.out.println("Running main in PersonRunner");

		Person person = new Employee();

		person.run();
		person.eat();
		person.work();
		person.sleep();
		person.relax();

		System.out.println(person.getOccupation());
		person.study();
		person.celebrateBirthday();
		person.exercise();
		person.getHome();
	
	}

}
