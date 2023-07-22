class CameraKiller{
	public static void main (String[] args){
		System.out.println("Running main in Camera killer");
		
		
		String location="Banglore";
		String date="05/06/2023";
		int howManyPeople=4;
		double resolutionInMp=190;
		String clarity="3HD";
		String cameraMan="Lavanya";
		
		String locName="Bhadravathi";
		double resolutionInMP=10;
		
		Camera.click(location,date,howManyPeople,resolutionInMp,clarity,cameraMan);
		System.out.println("");
		Camera.click(locName,date,howManyPeople,resolutionInMP,clarity,cameraMan);
		
		
		
	}
}