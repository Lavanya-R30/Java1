class PowerBankRunner{
	public static void main(String[] values){
		System.out.println("invoking main in Power Bank");
		PowerBank power=new PowerBank();
		System.out.println("power.brand");
		System.out.println("power.capacity");
		System.out.println("power.price");
		System.out.println("power.size");
		System.out.println("power.use");
		System.out.println("******************************************");
		PowerBank power1=new PowerBank();
		power1.brand="Realme";
		power1.capacity="1000mh";
		power1.price=1500;
	    power1.size="Small";
		power1.use="Reacharge";
		System.out.println( power1.brand);
		System.out.println(power1.capacity);
		System.out.println(power1.price);
		System.out.println(power1.size);
		System.out.println(power1.use);
		
	}
}