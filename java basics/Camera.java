class Camera{
	static void click(String location,String date,int howManyPeople ,double resolutionInMp,String clarity,String cameraMan){
		System.out.println("Invoking click() in Camera");
		if(location!=null){
			System.out.println("Location is valid:"+location);
		}
		else{
			System.err.println("Location is in-valid:"+location);
			return;
		}
		if(date!=null){
			System.out.println("Date is valid:"+date);
		}
		else{
			System.err.println("Date is in-valid:"+date);
			return;
		}
		if(howManyPeople>=0 && howManyPeople<=25){
			System.out.println("Number of peoples in photo is valid:"+howManyPeople);
		}
		else{
			System.err.println("Number of peoples in photo is in-valid:"+howManyPeople);
			return;
		}
		if(resolutionInMp>=20){
			System.out.println("Resolution of camera is valid:"+resolutionInMp);
		}
		else{
			System.err.println("Resolution of camera in-valid:"+resolutionInMp);
			return;
		}
		if(clarity!=null){
			System.out.println("Clarity is valid:"+clarity);
		}
		else{
			System.err.println("Clarity is in-valid:"+clarity);
			return;
		}
		if(cameraMan!=null){
			System.out.println("cameraMan is valid:"+cameraMan);
		}
		else{
			System.err.println("cameraMan is in-valid:"+cameraMan);
			return;
		}
	}
}