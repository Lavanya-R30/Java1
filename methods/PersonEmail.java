class PersonEmail{
	static String getEmailByName(String personName){
		System.out.println("invoking getEmailByName in Person Email");
		if(personName!=null){
			System.out.println("getAgeByName is valid");
			if("Lavanya"==personName){
			return "lavs@gmail.com";
		    }
		    if("Akshay"==personName){
			return "akshay@gmail.com";
		    }
		    if("Jayashree"==personName){
			return "jaya@gmail.com";
		    }
		    if("Sahana"==personName){
			return "sahana@gmail.com";
		    }
		    if("Vandana"==personName){
			return "vandu@gmail.com";
		    }
		    if("Deepika"==personName){
			return "deeps@gmail.com";
		    }
			if("Ramya"==personName){
			return "ramya@gmail.com";
		    }
			if("Anusha"==personName){
			return "anusha@gmail.com";
		    }
			if("Sandesh"==personName){
			return "sandy@gmail.com";
		    }
			if("Prem"==personName){
			return "prem@gmail.com";
		    }
			
		else{
			System.err.println("getEmailByName is in valid");
			System.err.println("#######################");
		    }
			
		}
		return "Names@gmail.com";
		
		
	}
	
}