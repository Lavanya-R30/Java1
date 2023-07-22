class JobKillerMethods{
	public static void main(String[] values){
		System.out.println("Invoking main in Job Killer");
		Job.apply();
		Job.apply(7.35);
		Job.apply("Akshay");
		Job.apply("Akshay",6);
		Job.apply("Akshay",5,"Karthik");
		Job.apply(4);
		Job.rejectOffer();
	}
}