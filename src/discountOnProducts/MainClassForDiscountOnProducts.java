package discountOnProducts;

import java.util.Scanner;

public class MainClassForDiscountOnProducts {

	public static void main(String[] args) {
		DiscountOnProducts dop = new DiscountOnProducts();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("The original price = $");
		double originalPrice = scan.nextDouble();
		
		
		Scanner promo = new Scanner(System.in);
		System.out.print("Enter Promo Code = ");
		String promocode1 = promo.nextLine();
		
		dop.originalAmount = originalPrice;
		dop.promoCode = promocode1;
		
		dop.discountForEveryone();

	}

}
