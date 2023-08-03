package com.xworkz.browser.util;

public class ChromeBrowser extends Browser{
	public String type = "Chrome";

	public void provideGoogleService() {
		System.out.println("Invoking provideGoogleService in ChromeBrowser");
	}
}
