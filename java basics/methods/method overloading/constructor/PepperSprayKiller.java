class PepperSprayKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in pepper Killer");
		
		PepperSpray pepper=new PepperSpray();
		System.out.println("PepperSpray name in main method:"+pepper.name);
		System.out.println("PepperSpray price in main method:"+pepper.price);
		System.out.println("PepperSpray grams in main method:"+pepper.grams);
		
		System.out.println("***********");
		
		PepperSpray pepper1=new PepperSpray("Zingy",600,200);
		System.out.println("PepperSpray name in main method:"+pepper1.name);
		System.out.println("PepperSpray price in main method:"+pepper1.price);
		System.out.println("PepperSpray grams in main method:"+pepper1.price);
		
	}
}