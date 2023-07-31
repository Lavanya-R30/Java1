class PepperSpray{
    String name;
	double price;
	int grams;
	
	 PepperSpray() {  ///no args
		 System.out.println("Invoking no-arguments from pepper spray");
		 System.out.println("PepperSpray name in constructor:"+this.name);
		 System.out.println("PepperSpray price constructor:"+this.price);
		 System.out.println("PepperSpray grams in constructor:"+this.grams);
		 this.name="Fuzzy";
		 this.price=450;
		 this.grams=100;
		 
	 }
	 PepperSpray(String name,double price,int grams)
	 {
		 System.out.println("Invoking arguments from pepper");
		 this.name=name;
		 this.price=price;
		 this.grams=grams;
		 
	 }

}