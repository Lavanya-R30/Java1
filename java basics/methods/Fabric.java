class Fabric{
	
	static int getPrice(String fabricName)
	{
		System.out.println("Invoking is valid");
		if(fabricName!=null)
		{
			System.out.println("getPrice is valid Fabric");
		}
		
		if("cotton"==fabricName)
		{
			return 180;
		}
		if("nylon"==fabricName)
		{
			return 200;
		}
		if("woolen"==fabricName)
		{
			return 314;
		}
		if("linen"==fabricName)
		{
			return 516;
		}
		if("polyster"==fabricName)
		{
			return 120;
		}
		if("silk"==fabricName)
		{
			return 671;
		}
		else
		{
			System.err.println("fabricType is in valid");
		}
		return 99;
		
	}
}