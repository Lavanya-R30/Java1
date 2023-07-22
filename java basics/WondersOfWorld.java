class WondersOfWorld{
	
	public static void main(String[] args){
		
		System.out.println("running main method wonders of world");
		String china="Great Wall of China";
		String mexico="Chichen Itza";
		String jordan="Petra";
		String peru="Machu Picchu";
		String brazil="Christ the Redeemer";
		String italy="Colosseum";
		String india="Taj Mahal";
		
		
		
	   String[] sevenwonders={china,india,mexico,jordan,peru,brazil,italy,};
		
		
		
		
		
		
		for(int size=0;size<sevenwonders.length;size++)
		{
			System.out.println("elements at index:"+size+"is:"+sevenwonders[size]);
		}
		
		
		
		
		
		
		 System.out.println("*****************************************");
		 
		 sevenwonders[2]="Sigiriya";
		 sevenwonders[5]="Chichen Itza";
		 
		 //System.out.println("elements at index 3 is after change:"+sevenwonders[4]);
		 //System.out.println("elements at index 4 is after change:"+sevenwonders[5]);
		 
		 
		 
		 
		 
		 for(int size=sevenwonders.length-1;size>=0;size--)
		 {
			 System.out.println("elements at index:"+size+"is:"+sevenwonders[size]);
			 
		 }
	}
	
}