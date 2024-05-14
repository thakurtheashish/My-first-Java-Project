package inheritanceExample2;

import inheritanceExample.Appliances;

public class AirFryer extends Appliances{
	
	public AirFryer(String name, String modelNumer, double price) {
		super(name, modelNumer, price);
		// calls parent/super class constructor and initializes all the variables in it  
		// TODO Auto-generated constructor stub
	}

	public AirFryer() {
		// TODO Auto-generated constructor stub
	}

	public void displaySpecifications() {
		System.out.println("Display specifications for " + name);
		System.out.println("Show air fryer details");
		System.out.println("Show air fryer capacity");
	}

}
