class Generator{
     String brand;
     int voltage;
	 double price;
	 Generator() {  ///no args
		 System.out.println("Invoking no-arguments from generator");
		 System.out.println("generator brand in constructor:"+this.brand);
		 System.out.println("generator voltage in constructor:"+this.voltage);
		 System.out.println("generator price in constructor:"+this.price);
		 this.brand="Kohler";
		 this.voltage=200;
		 this.price=85000;
		 
	 }
	 Generator(String brand,int voltage,double price)
	 {
		 System.out.println("Invoking arguments from generator");
		 this.brand=brand;
		 this.voltage=voltage;
		 this.price=price;
		 
	 }

}