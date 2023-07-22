class Flights{
	
	public static void main(String[] args){
		
		System.out.println("running main method flight names");
		String indigo="Indigo";
		String airIndia="AirIndia";
		String spiceJet="Spicejet";
		String vistara="Vistara";
		String airasia="Airasia";
		String gofirst="Go first";
		String goAir="go air";
		
		
		
	   String[] flightnames={indigo,airIndia,airasia,spiceJet,vistara,goAir,gofirst};
		
		
		
		
		
		
		for(int position=0;position<flightnames.length;position++)
		{
			System.out.println("elements at index:"+position+"is:"+flightnames[position]);
		}
		
		
		
		
		
		
		 System.out.println("*****************************************");
		 
		 flightnames[2]="Southwest";
		 flightnames[5]="Emirates";
		 
		 //System.out.println("elements at index 3 is after change:"+flightnames[2]);
		 //System.out.println("elements at index 4 is after change:"+flightnames[5]);
		 
		 
		 
		 
		 
		 for(int position=flightnames.length-1;position>=0;position--)
		 {
			 System.out.println("elements at index:"+position+"is:"+flightnames[position]);
			 
		 }
	}
	
}