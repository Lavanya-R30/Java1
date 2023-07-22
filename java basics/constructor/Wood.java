class Wood
{
	String typeOfWood;
	int size;
	Double price;
	String color;
	String shape;
	
	
	Wood()
	{
		System.out.println("Invoking no args from Wood");	
	}
	
	Wood(String typeOfWood)
	{
		this();
		this.typeOfWood=typeOfWood;
		System.out.println("Invoking string args from Wood");	
	}
	
	Wood(String typeOfWood,int size)
	{
		this(typeOfWood);
		System.out.println("Invoking string,int args from Wood");
        this.size=size;		
	}
	Wood(String typeOfWood,int size,Double price)
	{
		this(typeOfWood,size);
		System.out.println("Invoking string , int, double args from Wood");
        this.price=price;		
	}
	Wood(String typeOfWood,int size,Double price, String color, String shape)
	{
		this(typeOfWood,size,price);
		System.out.println("Invoking string , int, double, string args from Wood");
        this.color=color;	
        this.price=price;		
	}

}