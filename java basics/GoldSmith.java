
class GoldSmith{
	
	static void design(String designType,float qunatityInGrams,int price,String goldSmithName, int exp){
		System.out.println("Invoking design in GoldSmith");
		if(designType!=null){
			System.out.println("Kulfi brand  is valid:"+designType);
		}
		else{
			System.err.println("Kulfi brand  is in-valid:"+designType);
			return;
		}
		if(qunatityInGrams>=1){
			System.out.println("qunatity in grams is valid:"+qunatityInGrams);
		}
		else{
			System.err.println(" qunatity in gramsis in-valid:"+qunatityInGrams);
			return;
		}
		if(price>=4500){
			System.out.println("Price is valid:"+price);
		}
		else{
			System.err.println("Price is in-valid:"+price);
			return;
		}
		
		if(goldSmithName!=null){
			System.out.println("Name of the goldsmith is valid:"+goldSmithName);
		}
		else{
			System.err.println("Name of the goldsmith is in-valid:"+goldSmithName);
			return;
		}
		if(exp>0){
			System.out.println("Excperince is valid:"+exp);
		}
		else{
			System.err.println("Excperince is in-valid:"+exp);
			return;
		}
		
	}
}