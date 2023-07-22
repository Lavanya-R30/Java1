class KulfiKiller{
	public static void main (String[] args){
		System.out.println("Running main in KulfiKiller");
		
		
		String brand="Arun";
		float qunatityInGrams=80.8f;
		int price=75;
		String type="Chocolate";
		
		
		String brandKulfi=null;
		int cost=50;
		
		Kulfi.tasty(brand,qunatityInGrams,price,type);
		System.out.println("************");
		Kulfi.tasty(brandKulfi,qunatityInGrams,cost,type);
		
		
		
		
	}
}