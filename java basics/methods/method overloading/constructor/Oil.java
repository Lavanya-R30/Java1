class Oil{
	String name;
	double viscosity;
	int quantity;
	
	Oil(){ //no args
		System.out.println("Invoking no-arguments from Oil");
		System.out.println("oil name in Constructor:"+this.name);
		System.out.println("oil viscosity in Constructor:"+this.viscosity);
		System.out.println("oil quantity pinNumber in Constructor:"+this.quantity);
		this.name="Sunflower"; 
		this.viscosity=120;
		this.quantity=20;

	}
	Oil(String name){ 
		System.out.println("Invoking arguments from oil");
		System.out.println("Name Passed:"+name);
		this.name=name;                    
			
	}
	
	Oil(double viscosity,String name){ 
		System.out.println("Invoking arguments from oil");
		System.out.println("Name Passed:"+name);//null
	    System.out.println("viscosity values:"+viscosity);//0
		this.name=name;                    
		this.viscosity=viscosity;	
	}
	
	Oil(int quantity,double viscosity,String name){ 
		System.out.println("Invoking arguments from oil");
		System.out.println("Name Passed:"+name);//null
	    System.out.println("viscosity values:"+viscosity);//0
		System.out.println("quantity:"+quantity);//0.0
		this.name=name;                    
		this.viscosity=viscosity;	
	}
	
		
}
