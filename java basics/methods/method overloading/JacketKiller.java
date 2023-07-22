class JacketKiller{
	public static void main(String[] values){
		System.out.println("invoking main in JacketKiller");
		Jacket jacket=new Jacket();
		System.out.println(jacket.price);
		System.out.println(jacket.brand);
		System.out.println(jacket.size);
		System.out.println(jacket.fabric);
		System.out.println(jacket.usedFor);
		System.out.println("*************************");
		Jacket jacket1=new Jacket();
		jacket1.brand="belstaff";
		jacket1.fabric="Cotton";
		jacket1.price=1200;
		jacket.size="XL";
		jacket1.usedFor="Warm";
		System.out.println(jacket1.price);
		System.out.println(jacket1.brand);
		System.out.println(jacket1.size);
		System.out.println(jacket1.fabric);
		System.out.println(jacket1.usedFor);
		
	}
}