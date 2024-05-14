package z;

public class Banquet {

	double baseBookingCost;
	double cessCost;
	double taxOnBaseCost;
	double baseCost;
	double foodCost;
	double beverageAndTipsCost;
	int numberOfGuests;
	double totalBookingCost;

	public Banquet(double baseCost, double foodCost, double beverageAndTipsCost, int numberOfGuests) {
		super();
		this.baseCost = baseCost;;
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
		} else if (numberOfGuests <= 80) {
			cessCost = (baseBookingCost * 8) / 100;
		} else if (numberOfGuests <= 150) {
			cessCost = (baseBookingCost * 10) / 100;
		} else if (numberOfGuests > 150) {
			cessCost = (baseBookingCost * 12.5) / 100;
		}
		return cessCost;
	}

	public double calculateTax(double baseBookingCost) {
		taxOnBaseCost = (baseBookingCost * 15) / 100;
		return taxOnBaseCost;
	}

	public double calculateTheTotalCost() {
	    int a = 10;
		baseBookingCost = calculateBaseCost();
		cessCost = calculateCess(baseBookingCost);
		taxOnBaseCost = calculateTax(baseBookingCost);
		totalBookingCost = baseBookingCost + taxOnBaseCost + cessCost;
		return totalBookingCost;
	}

}
