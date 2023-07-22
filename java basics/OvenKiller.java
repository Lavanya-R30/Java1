class OvenKiller{
	public static void main (String[] args){
		System.out.println("Running main in Oven killer");
		
		
		String ovenType="Gas Ovens";
		String bakingItem="Cake";
		int bakingTempInC=400;
		String bakingMode="Convection";
		
		
		String type="Direct-Fired oven";
		int bakingTemp=120;
		
		Oven.baking(ovenType,bakingItem,bakingTempInC,bakingMode);
		System.out.println("****************");
		Oven.baking(type,bakingItem,bakingTemp,bakingMode);
		
		
		
		
	}
}