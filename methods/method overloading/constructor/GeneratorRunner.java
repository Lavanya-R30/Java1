class GeneratorRunner{
	public static void main(String[] args){
		System.out.println("Invoking main in Generator runner");
		
		Generator generator=new Generator();
		System.out.println("Generator brand in main method:"+generator.brand);
		System.out.println("Generator voltage in main method:"+generator.voltage);
		System.out.println("Generator price in main method:"+generator.price);
		
		System.out.println("******************************************************");
		
		Generator generator1=new Generator("Alpha",250,100000);
		System.out.println("Generator brand in main method:"+generator1.brand);
		System.out.println("Generator voltage in main method:"+generator1.voltage);
		System.out.println("Generator price in main method:"+generator1.price);
		
	}
}