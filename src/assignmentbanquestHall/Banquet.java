package assignmentbanquestHall;

public class Banquet {

	double baseCost;
	double foodCost;
	double beverageAndTipsCost;
	double baseBookingCost;
	double cessCost;
	double taxOnBaseCost;
	int numberOfGuests;
	double theTotalCost;
	
	public Banquet(double baseCost, double foodCost, double beverageAndTipsCost, int numberOfGuests) {
		super();
		this.baseCost = baseCost;
		this.foodCost = foodCost;
		this.beverageAndTipsCost = beverageAndTipsCost;
		this.numberOfGuests = numberOfGuests;
	}

	public double calculateBaseCost() {
		baseBookingCost = baseCost + foodCost + beverageAndTipsCost;
		return baseBookingCost;
	}
	
	public double calculateCess(double baseBookingCost) {
		if (numberOfGuests <= 40) {
			cessCost = (baseBookingCost * 4) / 100;
		}else if (numberOfGuests <= 80) {
			cessCost = (baseBookingCost * 8) / 100;
		}else if (numberOfGuests <= 150) {
			cessCost = (baseBookingCost * 10) / 100;
		}else if (numberOfGuests > 150  ) {
			cessCost = (baseBookingCost * 12.5) / 100;
		}
		return cessCost;
	}

	public double calculateTax(double baseBookingCost) {
		taxOnBaseCost = (baseBookingCost * 15) / 100;
		return taxOnBaseCost;
	}
	
	public double calculateTheTotalCost() {
		baseBookingCost = calculateBaseCost();
		cessCost = calculateCess(baseBookingCost);
		taxOnBaseCost = calculateTax(baseBookingCost);
		
		 theTotalCost = baseBookingCost + taxOnBaseCost + cessCost;
		 return theTotalCost;
	}

}
