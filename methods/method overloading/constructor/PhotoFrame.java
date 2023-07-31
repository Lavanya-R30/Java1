class PhotoFrame{
    String size;
	String backgroundColor;
	int price;
	 PhotoFrame() {  ///no args
		 System.out.println("Invoking no-arguments from photo frame");
		 System.out.println("PhotoFrame size in constructor:"+this.size);
		 System.out.println("PhotoFrame backgrounder constructor:"+this.backgroundColor);
		 System.out.println("PhotoFrame price in constructor:"+this.price);
		 this.size="Large";
		 this.backgroundColor="black";
		 this.price=1500;
		 
	 }
	 PhotoFrame(String size,String backgroundColor,int price)
	 {
		 System.out.println("Invoking arguments from photo frame");
		 this.size=size;
		 this.backgroundColor=backgroundColor;
		 this.price=price;
		 
	 }

}


