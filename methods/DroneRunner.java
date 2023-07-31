class DroneRunner{
	public static void main(String[] args){
		System.out.println("running main in Drone Runner");
		
		double ref=Drone.getDistanceByFlight("Dronebits","Aerial Photo");
		System.out.println("ref is:"+ref);
		
		ref=Drone.getDistanceByFlight("Dronefly","Baloon carrier");
		System.out.println("ref is:"+ref);
		
		ref=Drone.getDistanceByFlight(null,null);
		System.out.println("ref is:"+ref);
		
		ref=Drone.getDistanceByFlight("droneoperator","gernalisum");
		System.out.println("ref is:"+ref);
		
		System.out.println("***************************************");
		
		double price=Drone.getPricePerEvent("Aerial Photo");
		System.out.println("price is:"+price);
		
		price=Drone.getPricePerEvent("Baloon carrier");
		System.out.println("price is:"+price);
		
		price=Drone.getPricePerEvent(null);
		System.out.println("price is:"+price);
		
		price=Drone.getPricePerEvent("gernalisum");
		System.out.println("price is:"+price);
		
		System.out.println("****************************************");
		
		int discount=Drone.getDiscountByEvent("Aerial Photo","Amith");
		System.out.println("discount is:"+discount);
		
		discount=Drone.getDiscountByEvent("Baloon Carrier","Sahana");
		System.out.println("discount is:"+discount);
		
		discount=Drone.getDiscountByEvent(null,null);
		System.out.println("discount is:"+discount);
		
		discount=Drone.getDiscountByEvent("gernalisum","Anusha");
		System.out.println("discount is:"+discount);
	}
}