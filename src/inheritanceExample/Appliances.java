package inheritanceExample;

public class Appliances {
	
	private String num;
	String defaultVariable;
	protected String name;
	protected String modelNumer;
	protected double price;
	double rating;
	String[] comments; 
	
	
	// Has a concept - composition
	
	public Reviews customerReviews;
	
	public Appliances() {
		
	}
	
	public Appliances(String name, String modelNumer, double price) {
		super();
		this.name = name;
		this.modelNumer = modelNumer;
		this.price = price;
	}

	public void displayReview() {
		System.out.println("Display customer rating for " + name);
		System.out.println("Display customer comments ");
		
	}
	
	public void displaySpecifications() {
		System.out.println("Display specifications for " + name);
		
	}
	
	public void checkOffer() {
		
	}

}
