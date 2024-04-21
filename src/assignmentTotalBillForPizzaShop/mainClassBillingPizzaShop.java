package assignmentTotalBillForPizzaShop;

/*Write a program to prepare the bill for a pizza shop. Assume 
 * an order and work out the final bill. Take the Cheese Pizza 
 * prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: 
 * $25 For additional pepperoni topping: Pepperoni for Small
 *  Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3 Extra 
 *  cheese for any size pizza: + $1 For eg: If the Pizza is 
 *  medium, pepperoni with extra cheese the program should 
 *  calculate the final bill as 20+3+1 = $24 and print 
 *  as “Your final bill is $24”
 */
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
