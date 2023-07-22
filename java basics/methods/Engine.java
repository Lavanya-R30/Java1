class Engine{
	
	static int getCCByModel(String modelName){
		System.out.println("invoking getCCByModel in Engine");
		if(modelName!=null){
			System.out.println("getCCByModel is valid");
			if("Swift"==modelName)
			{
				return 1997;
			}
			if("Rapid"==modelName)
			{
				return 1899;
			}
			if("BMW"==modelName)
			{
				return 4978;
			}
			if("Benz"==modelName)
			{
				return 2963;
			}
			if("Audi"==modelName)
			{
				return 6718;
			}
			if("Bentely"==modelName)
			{
				return 1998;
			}
			else
			{
				System.err.println("getCCByModel is in valid");
			}
		}
		return 999;
			
			
		}
	}
	
