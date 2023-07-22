class GoldSmithKiller{
	public static void main (String[] args){
		System.out.println("Running main in gold");

		String designType="Gold plated";
		float qunatityInGrams=10;
		int price=10000;
		String goldSmithName="dhileep";
		int exp=3;
		
		
		String type="Solid Gold";
		int cost=2000;
		
		GoldSmith.design(designType,qunatityInGrams,price,goldSmithName,exp);
		System.out.println("********");
		GoldSmith.design(type,qunatityInGrams,cost,goldSmithName,exp);
		
		
		
		
		
	}
}