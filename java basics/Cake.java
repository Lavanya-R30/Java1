class Cake{
	static void tasty(String name,String type,int noOfPieces,String bakeryName,String occassion){
		System.out.println("Invoking cake() in cake");
		if(name!=null){
			System.out.println("Cake name is valid:"+name);
		}
		else{
			System.out.println("Cake name is in-valid:"+name);
			return;
		}
		if(type!=null){
			System.out.println("types of cake is valid:"+type);
		}

		else{
			System.out.println("types of cake is in-valid:"+type);
			return;
		}
		if(noOfPieces>0){
			System.out.println("Number Of pieces is valid:"+noOfPieces);
		}
		else{
			System.out.println("Number Of pieces  is in-valid:"+noOfPieces);
			return;
		}
		if(bakeryName!=null){
			System.out.println("name of bakery is valid:"+bakeryName);
		}
		else{
			System.out.println("name of bakery is in-valid:"+bakeryName);
			return;
		}
		
		
		if(occassion!=null){
			System.out.println("occassion  is valid:"+occassion);
		}
		else{
			System.out.println("occassion is in-valid:"+occassion);
			return;
		}
	}
}