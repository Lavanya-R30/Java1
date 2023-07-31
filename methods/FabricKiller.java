class FabricKiller{
	
	public static void main(String[] args){
		
		System.out.println("running main in fabric killer");
		
		int fabric1=Fabric.getPrice("cotton");
		System.out.println("fabric1 is:"+fabric1);
		
		int fabric2=Fabric.getPrice("nylon");
		System.out.println("fabric2 is:"+fabric2);
		
		int fabric3=Fabric.getPrice("woolen");
		System.out.println("fabric3 is:"+fabric3);
		
		int fabric4=Fabric.getPrice("linen");
		System.out.println("fabric4 is:"+fabric4);
		
		int fabric5=Fabric.getPrice("polyster");
		System.out.println("fabric5 is:"+fabric5);
		
		int fabric6=Fabric.getPrice("silk");
		System.out.println("fabric6 is:"+fabric6);
		
	}
}