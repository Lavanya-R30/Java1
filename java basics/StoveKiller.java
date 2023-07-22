class StoveKiller{
	public static void main(String[] values){
		System.out.println("invoking main in stoveKiller");
		String type="Gas Stove";
		int price=1500;
		String brand="Prestige";
		Stove.fire(type,price,brand);
	}
}