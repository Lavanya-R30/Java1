class PhotoFrameRunner{
	public static void main(String[] args){
		System.out.println("Invoking main in Photo frame runner");
		
		PhotoFrame photo=new PhotoFrame();
		System.out.println("PhotoFrame size in main method:"+photo.size);
		System.out.println("PhotoFrame backgroundcolor in main method:"+photo.backgroundColor);
		System.out.println("PhotoFrame price in main method:"+photo.price);
		
		System.out.println("******************************************************");
		
		PhotoFrame photo1=new PhotoFrame("Small","Pink",1200);
		System.out.println("PhotoFrame size in main method:"+photo1.size);
		System.out.println("PhotoFrame backgroundcolor in main method:"+photo1.backgroundColor);
		System.out.println("PhotoFrame price in main method:"+photo1.price);
		
	}
}