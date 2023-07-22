class Soda{
	static void drink(String name,int calories,double price){
		System.out.println("Invoking drink() in Soda");
		if(name!=null)
		{
			System.out.println("Name is valid:"+name);
		}
		else
		{
			System.err.println("Name is in valid:"+name);
			return;
		}
		if(calories>=120)
		{
		     System.out.println("Calories is valid:"+calories);
		}
		else
		{
			System.err.println("Calories is in valid:"+calories);
			return;
		}
		if(price>=40)
		{
			System.out.println("Price is valid:"+price);
		}
		else
		{
			System.err.println("Price is in valid:"+price);
			return;
		}
	}
}