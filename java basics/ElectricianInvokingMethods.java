class ElectricianInvokingMethods{

public static void main(String[] args){
	
	System.out.println("Electrician methods Invoking");
	Electrician.repair();
	Electrician.repair("motor");
	Electrician.repair(20);
	Electrician.repair(100000.00f);
	Electrician.repair(40);
	Electrician.install("Fan");
	Electrician.install(10);
	Electrician.maintains();
	Electrician.replace();
	Electrician.checkStatus();

	electricUpgrade();
	customerService();
	
	
	
}
    static void electricUpgrade(){
		System.out.println("Electrician does electric Upgrade");
	}
	
	static void customerService(){
		System.out.println("Electrician does customer Service every time");
	}
	



}