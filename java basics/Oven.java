class Oven{
	static void baking(String ovenType,String bakingItem,int bakingTempInC,String bakingMode){
		System.out.println("Invoking tasty() in Oven");
		if(ovenType!=null){
			System.out.println("Oven Type is valid:"+ovenType);
		}
		else{
			System.err.println("Oven Type is in-valid:"+ovenType);
			return;
		}
		if(bakingItem!=null){
			System.out.println("Baking Item is valid:"+bakingItem);
		}
		else{
			System.err.println("Baking Item is in-valid:"+bakingItem);
			return;
		}
		if(bakingTempInC>=150){
			System.out.println("Baking Temperature in Celcius is valid:"+bakingTempInC);
		}
		else{
			System.err.println("Baking Temperature in Celcius is in-valid:"+bakingTempInC);
			return;
		}
		
		if(bakingMode!=null){
			System.out.println("Baking mode is valid:"+bakingMode);
		}
		else{
			System.err.println("BAking mode is in-valid:"+bakingMode);
			return;
		}
	}
}