class Kulfi{
	
	static void tasty(String brand,float qunatityInGrams,int price,String type){
		System.out.println("Invoking tasty() in Kulfi");
		if(brand!=null){
			System.out.println("Kulfi brand  is valid:"+brand);
		}
		else{
			System.err.println("Kulfi brand  is in-valid:"+brand);
			return;
		}
		if(qunatityInGrams>=10){
			System.out.println("qunatity in grams is valid:"+qunatityInGrams);
		}
		else{
			System.err.println("qunatityInGrams is in-valid:"+qunatityInGrams);
			return;
		}
		if(price>=30){
			System.out.println("Price is valid:"+price);
		}
		else{
			System.err.println("Price is in-valid:"+price);
			return;
		}
		
		if(type!=null){
			System.out.println("Type Of Kulfi is valid:"+type);
		}
		else{
			System.err.println("Type of Kulfi is in-valid:"+type);
			return;
		}
	}
}