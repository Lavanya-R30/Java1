class OilKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking oil in main oilKiller");
         Oil oil=new Oil();
		 System.out.println(oil.name); //null
		System.out.println(oil.viscosity); //0
		System.out.println(oil.quantity); //0.0
		
		System.out.println("*************************************");
		
		Oil oil1=new Oil("Coconut");
		System.out.println(oil1.name);
		
		
		Oil oil2=new Oil(45,"olive");
		System.out.println(oil2.viscosity);
		
		Oil oil3=new Oil(120,69,"Sunflower");
		System.out.println(oil3.quantity);
		
	}
}