package assignmentTotalBillForPizzaShop;

import java.util.Scanner;

public class mainClassBillingPizzaShop {

	public static void main(String[] args) {
		int smallPizza = 15;
		int mediumPizza = 20;
		int largePizza = 25;
		int extraPeppSmall = 2;
		int extraPeppM_L = 3;
		int extraCheese = 1;
		int price = 0;
		int numberOfPizza;
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Which cheese pizza would you like to order? ");
		String pizzaSelected = sc.nextLine();
		
		System.out.println("Would you like extra pepperoni? ");
		String extraPepp = sc.nextLine();
		
		System.out.println("Would you like extra chesse? ");
		String xtraCheese = sc.nextLine();
		
		switch (pizzaSelected)
		{
		case "Small":
			price = smallPizza;
			if (extraPepp.equals("yes")) {
				price = price + extraPeppSmall;
			} if (xtraCheese.equals("yes")) {
				price = price + extraCheese;
			}
				System.out.println("Your total for is = $" +price);
				break;
		case "Medium":
			price = mediumPizza;
			if (extraPepp.equals("yes")) {
				price = price + extraPeppM_L;
			} if (xtraCheese.equals("yes")) {
				price = price + extraCheese;
			}
				System.out.println("Your total for is = $" +price);
				break;
		case "Large":
			price = largePizza;
			if (extraPepp.equals("yes")) {
				price = price + extraPeppM_L;
			} if (xtraCheese.equals("yes")) {
				price = price + extraCheese;
			}
				System.out.println("Your total for is = $" +price);
				break;
				default:
					System.out.println("Invalid Entry");
	
	
}
}}
