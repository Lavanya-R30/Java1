class ScannerKiller{
	public static void main(String[] values){
		System.out.println("invoking main in ScannerKiller");
		String name="GooglePay";
		int price=100;
		String capture="image";
		Scanner.scan(name,price,capture);
	}
}