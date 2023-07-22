class WoodRunner
{
	public static void main(String[] args)
	{
		System.out.println("Invoking main method");
		Wood wood=new Wood("Plum",95);
		System.out.println("**********************************");
		Wood wood1=new Wood("Plum",95,5000.0);
		System.out.println("**********************************");
		Wood wood2=new Wood("Plum",95,1100.0,"Gum","Cone");
	}
}