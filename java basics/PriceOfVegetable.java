class PriceOfVegetable{
	
	public static void main(String[] args){
		
		System.out.println("running main method vegetables");
		float tomato=30;
		float onion=40;
		float potato=50;
		float carrot=20;
		float broccali=34;
		float cauliFlower=45;
		float beetRoot=15;
		
		
		
	   float[] vegetables={tomato,onion,potato,carrot,broccali,cauliFlower,beetRoot};
		
		
		
		
		
		
		for(int price=0;price<vegetables.length;price++)
		{
			System.out.println("elements at index:"+price+"is:"+vegetables[price]);
		}
		
		
		
		
		
		
		 System.out.println("*****************************************");
		 
		 vegetables[1]=55;
         vegetables[2]=48;
		 
		 System.out.println("elements at index 1 is after change:"+vegetables[1]);
		 System.out.println("elements at index 2 is after change:"+vegetables[2]);
		 
		 
		 
		 
		 
		 for(int price=vegetables.length-1;price>=0;price--)
		 {
			 System.out.println("elements at index:"+price+"is:"+vegetables[price]);
			 
		 }
	}
	
}