package inheritanceExample2;

import inheritanceExample.Appliances;
import inheritanceExample.WashinMachine;

public class Main {
	public static void main(String[] args) {

		Appliances app = new Appliances();

//		AirFryer airfryer = new AirFryer("Hoang Air Fryer", "4556sds", 650.99);
//
//		airfryer.displaySpecifications();
//		airfryer.displayReview();
//		
		MacBook mac = new MacBook();
		mac.orderextraMemory();
		mac.displayReview();
		mac.displaySpecifications();
		System.out.println("-----------------");
		Appliances appliane1 = new MacBook();
	//	appliane1.displayReview();
		appliane1.displaySpecifications();
		System.out.println("-----------------");
		Appliances app2 = new AirFryer ();
	//	app2.displayReview();
		app2.displaySpecifications();
		System.out.println("-----------------");
		Appliances app3 = new WashinMachine ();
	//	app3.displayReview();
		app3.displaySpecifications();
		
		

	}

}
