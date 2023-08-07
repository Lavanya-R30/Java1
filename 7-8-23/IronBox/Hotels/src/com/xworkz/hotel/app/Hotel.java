package com.xworkz.hotel.app;

public class Hotel {
	public String hotelName;
	public double price;


	
public  void hotel() {
	System.out.println("Invoking main method of  hotels");
	hotel("Tajmahal");
	hotel(50);


}
public void hotel(String hotelName) {
	System.out.println("Invoking the main hotel name");
	System.out.println("hotelName:"+hotelName);
}

public void hotel(double price) {
	System.out.println("Invoking the main price");
	System.out.println("price:"+price);
}


public void hotel(String hotelName,double price) {

	System.out.println("Invoking the main hotel ");

    hotel(hotelName);
    hotel(price);

}



}

