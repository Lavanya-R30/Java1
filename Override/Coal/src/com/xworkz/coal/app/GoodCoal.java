package com.xworkz.coal.app;

public class GoodCoal extends Coal{
@Override
public void burn() {
	super.burn();
	System.out.println("Invoking burn() in good coal");
}
}
