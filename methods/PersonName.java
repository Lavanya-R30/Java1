class PersonName{
	static int getAgeByName(String name ){
		System.out.println("invoking getAgeByName in Person Name");
		if(name!=null){
			System.out.println("getAgeByName is valid");
			if("Lavanya"==name){
			return 21;
		    }
		    if("Akshay"==name){
			return 18;
		    }
		    if("Jayashree"==name){
			return 49;
		    }
		    if("Sandesh"==name){
			return 25;
		    }
		    if("Ramya"==name){
			return 23;
		    }
		    if("Prem"==name){
			return 24;
		    }
			if("Anusha"==name){
			return 30;
		    }
			if("Deepika"==name){
			return 45;
		    }
			if("Sandya"==name){
			return 40;
		    }
			if("Ramesh"==name){
			return 35;
		    }
			
		else{
			System.err.println("getAgeByName is in valid");
		    }
			
		}
		return 10;
		
	}
	
}