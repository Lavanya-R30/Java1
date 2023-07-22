class GroceryItems{
	
	public static void main(String[] args){
		
		System.out.println("running in main method of grocery");
		String oil="Oil";
		String soap="Soap";
		String shampoo="Shampoo";
		String chesse="Chesse";
		String rice="Rice";
		String chocolates="Chocolates";
		String eggs="Eggs";
		
		
		String[] grocerys={oil,shampoo,soap,chesse,rice,chocolates,eggs};
		
		
		int total=grocerys.length;
		System.out.println("Total grocery items are:" +total);
		
		
		
		for(int items=0;items<grocerys.length;items++)
		{
			System.out.println("elements at index:"+items+"is:"+grocerys[items]);
		}
		
		
		
		
		
		
		 System.out.println("*****************************************");
		 
		 grocerys[3]="Butter";
		 grocerys[4]="Honey";
		 
		 System.out.println("elements at index 3 is after change:"+grocerys[3]);
		 System.out.println("elements at index 4 is after change:"+grocerys[4]);
		 
		 
		 
		 
		 
		 for(int items=grocerys.length-1;items>=0;items--)
		 {
			 System.out.println("elements at index:"+items+"is:"+grocerys[items]);
			 
		 }
	}
	
}