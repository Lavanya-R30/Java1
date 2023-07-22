class CakeKiller{
	public static void main (String[] args){
		System.out.println("Running main in cakeKiller`");
		
		
		String name="Redvelvet";
		int noOfPieces=5;
		String type="eggless";
		String bakeryName="Ganesh bhavana";
		String occassion="Birthday celebration";
		
		
	    Cake.tasty(name,type,noOfPieces,bakeryName,occassion);
		
		
		System.out.println("");
		Cake.tasty(name,type,noOfPieces,bakeryName,occassion);
		
	}
}