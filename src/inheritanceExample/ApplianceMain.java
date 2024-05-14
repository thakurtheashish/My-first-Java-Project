package inheritanceExample;

import inheritanceExample2.AirFryer;
import inheritanceExample2.Laptop;

public class ApplianceMain {

	public static void main(String[] args) {
		
		Appliances laptop = new Appliances("Ace Laptop", "Xyz1234", 654.50);
		Appliances airFryer = new Appliances("Air Fryer", "Abc9876", 250.99);
		
		laptop.displaySpecifications();
		airFryer.displaySpecifications(); 
		
		Laptop hpLaptop = new Laptop();
		hpLaptop.name = "HP Laptop";
		hpLaptop.modelNumer = "xbksh12";
		hpLaptop.price = 900;
		System.out.println("The price of hp laptiop is : " + hpLaptop.price);
		hpLaptop.displayReview();
		hpLaptop.displaySpecifications();

		AirFryer airfryer = new AirFryer();
		airfryer.name = "Phillip Air Fryer";
		airfryer.modelNumer = "hdj93743lk";
		airfryer.price = 750;
		airfryer.displayReview();
		airfryer.displaySpecifications();
		Reviews airFryerReviews = new Reviews();
		airFryerReviews.rating = 4;
		String [] commentsforAF = {"Bad Product" , "poor" , "Affordable"};
		airfryer.customerReviews = airFryerReviews;
		
		
		WashinMachine wm = new WashinMachine();
		
		Reviews customerReviewsForWM = new Reviews();
		
		customerReviewsForWM.setRating(3.5);
		String[] comments = {"Good Product" , "Excellent" , "Affordable"};
		customerReviewsForWM.setComments(comments);
		
		wm.customerReviews = customerReviewsForWM;
		
	}

}
