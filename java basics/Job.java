class Job{
	static void apply()
	{
		System.out.println("Invoking apply() in Job");
		String name="Kiran";
		System.out.println("Person Name:"+ name);
	}
	static void apply(String personName,int exp)
	{
		System.out.println("Person Name:"+personName);
		System.out.println("Experience:"+exp);
	}
	static void apply(String personName)
	{
		System.out.println("Person Name:"+personName);
		
	}
	static void apply(double cgpa)
	{
		System.out.println("cgpa:"+cgpa);
		
	}
	static void apply(String personName,int exp,String refName)
	{
		System.out.println("Person Name:"+personName);
		System.out.println("Experience:"+exp);
		System.out.println("Reference Name:"+refName);
	}
	static void apply(int exp)
	{
		
		System.out.println("Experience:"+exp);
	}
	static void rejectOffer()
	{
		System.out.println("Invoking Reject Offer() in Job");
	}
}