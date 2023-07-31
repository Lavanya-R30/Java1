class Drone{
	static double getDistanceByFlight(String operator,String event){
		System.out.println("Invoking getDistanceByFlight in Drone");
		if(operator!=null &&event!=null){
			System.out.println("Operator  and eventis valid");
			if("Dronebits"==operator && "Aerial Photo"==event){
				return 2.2;
			}
			if("Dronefly"==operator && "Baloon carrier"==event){
				return 4.2;
			}
		}
		else{
			System.err.println("Operator and event is in-valid");
			return -1.0;
		}
		
		return 1.0;
	}
	static double getPricePerEvent(String eventName){
		System.out.println("Invoking getPricePerEvent in Drone");
		if(eventName!=null){
			System.out.println("Event name is valid");
			if("Dronebits"==eventName){
				return 5000.0;
			}
			if("Dronefly"==eventName){
				return 2500.50;
			}
		}
		else{
			System.err.println("Event name is in-valid");
			return 500.0;
		}
		
		return 100;
	}
	static int getDiscountByEvent(String eventName,String refPerson){
		System.out.println("Invoking getDiscountByEvent in Drone");
		if(eventName!=null &&refPerson!=null){
			System.out.println("Event Name  and refered person is valid");
			if("Aerial Photo"==eventName && "Amith"==refPerson){
				return 50;
			}
			if("Baloon carrier"==eventName && "Sahana"==refPerson){
				return 100;
			}
		}
		else{
			System.err.println("Operator and event is in-valid");
			return -1;
		}
		
		return 10;
	}
	
	
}