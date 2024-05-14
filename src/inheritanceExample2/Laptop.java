package inheritanceExample2;

import inheritanceExample.Appliances;

public class Laptop extends Appliances{
	
	public Laptop(String name, String modelNumer, double price) {
		super(name, modelNumer, price);
		// TODO Auto-generated constructor stub
	}

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public void displaySpecifications() {
		System.out.println("Display specifications for " + name);
		System.out.println("Show processor details");
		System.out.println("Show Memory Details");
	}
	
	public void orderextraMemory() {
		System.out.println("Extra memory ordered");
	}

}
