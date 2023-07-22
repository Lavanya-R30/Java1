class Train{
	static String getTrainName(int trainNumber){
		System.out.println("Invoking the valid train");
		
		if(trainNumber>=2000)
		{
			System.out.println("getTrainName is valid");
        }
		
		if(11013==trainNumber)
		{
			return "Rajadhani";
		}
		if(11013==trainNumber)
		{
			return "Shatabdi";
		}
		if(12134==trainNumber)
		{
			return "Kavi Guru Express";
		}
		if(22691==trainNumber)
		{
			return "intercity";
		}
		
		else
		{
			System.err.println("getTrainName is in valid");
		}
		return "mysore express";
	}
}