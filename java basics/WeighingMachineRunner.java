class WeighingMachineRunner{
	public static void main (String[] args){
		System.out.println("Running main in WeighingMachineRunner");
		
		
		String machineType="Digital Weighing Machine";
		String scaleOfMeasure="Nominal";
		int machineCapacityInKg=200;
		String itemName="Chips";
		
		
		String type="Analytical Weighing Machine";
		int machineCapacity=-20;
		
		WeighingMachine.measureWeight(machineType,scaleOfMeasure,machineCapacityInKg,itemName);
		System.out.println("***********************");
		WeighingMachine.measureWeight(type,scaleOfMeasure,machineCapacity,itemName);
		
		
		
		
	}
}