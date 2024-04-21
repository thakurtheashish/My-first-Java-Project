package z;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the base cost of booking banquet hall : $");
		double baseCost = sc.nextDouble();
		
		System.out.print("Enter the cost of food : $");
		double foodCost = sc.nextDouble();
		
		System.out.print("Enter the cost of beverages and tips : $");
		double beverageAndTipsCost = sc.nextDouble();
		
		System.out.print("Enter the number of guest : ");
		int numberOfGuests = sc.nextInt();
		
		Banquet banquet = new Banquet (baseCost, foodCost, beverageAndTipsCost, numberOfGuests);
		
		System.out.print("The total cost for booking is : $" + banquet.calculateTheTotalCost());
		
		
	}

}
