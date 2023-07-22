class Biscuits{
	
	public static void main(String[] args){
		
		System.out.println("running main method biscuits");
		String goodDay="Goodday";
		String momsMagic="Momsmagic";
		String marieLite="Marielite";
		String tiger="Tiger";
		String hiFi="Hifi";
		String bourbon="Bourbon";
		String darkFantasy="Darskfantasy";
		
		
		
	   String[] bisc={goodDay,marieLite,momsMagic,tiger,hiFi,bourbon,darkFantasy};
		
		
		int total=bisc.length;
		System.out.println("Total biscuits names are:" +total);
		
		
		
		for(int bisci=0;bisci<bisc.length;bisci++)
		{
			System.out.println("elements at index:"+bisci+"is:"+bisc[bisci]);
		}
		
		
		
		
		
		
		 System.out.println("*****************************************");
		 
		 bisc[4]="Milkbikis";
		 bisc[5]="Oreo";
		 
		 //System.out.println("elements at index 3 is after change:"+bisc[4]);
		 //System.out.println("elements at index 4 is after change:"+bisc[5]);
		 
		 
		 
		 
		 
		 for(int bisci=bisc.length-1;bisci>=0;bisci--)
		 {
			 System.out.println("elements at index:"+bisci+"is:"+bisc[bisci]);
			 
		 }
	}
	
}