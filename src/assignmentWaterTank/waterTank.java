package assignmentWaterTank;

public class waterTank {

	int bucketCapacity = 10;
	int tankCapacity = 100;
	int remainingCapacity;
	int tankWaterLevel;
	
	void checkWaterLevel() {
	
	if(tankWaterLevel == tankCapacity)
	{
		System.out.println("Tank is already full.");
	}else{
		remainingCapacity = tankCapacity - tankWaterLevel;
	     while (remainingCapacity > 0) {
	    tankWaterLevel = tankWaterLevel + bucketCapacity;
		System.out.println("Drop bucket and tank level is = " + tankWaterLevel + " litres");
		remainingCapacity = tankCapacity - tankWaterLevel;
	}{
		System.out.println("Tank has been completely filled");
	}}
	}}