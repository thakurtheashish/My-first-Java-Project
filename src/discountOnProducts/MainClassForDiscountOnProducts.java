package discountOnProducts;

import java.util.Scanner;

public class MainClassForDiscountOnProducts {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("The original price = $");
		double originalPrice = scan.nextDouble();
		
		
		Scanner promo = new Scanner(System.in);
		System.out.print("Enter Promo Code = ");
		double promocode = promo.nextDouble();
		
		DiscountOnProducts dop = new DiscountOnProducts();
		dop.originalAmount = originalPrice;
		dop.promoCode = promocode;
		
		dop.discountForEveryone();

	}

}
