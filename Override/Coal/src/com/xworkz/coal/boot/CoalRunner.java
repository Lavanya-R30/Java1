package com.xworkz.coal.boot;

import com.xworkz.coal.app.Coal;
import com.xworkz.coal.app.GoodCoal;

public class CoalRunner {

	public static void main(String[] args) {
		System.out.println("Invoking the coal");

    Coal coal=new GoodCoal();
    coal.burn();

	}

}
