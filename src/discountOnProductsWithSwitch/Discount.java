package discountOnProductsWithSwitch;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {

		Scanner originalPrice = new Scanner(System.in);
		System.out.print("Enter the total amount = $");
		double totalBill = originalPrice.nextDouble();

		Scanner promoCode = new Scanner(System.in);
		System.out.print("If you have any PromoCode, Enter here = ");
		String promo = promoCode.nextLine();

		double discountedPrice, discountAmount;

		discountAmount = (totalBill * 50 / 100);
		discountedPrice = (totalBill - discountAmount);

		switch (promo) {
		case "Promo5":
			discountAmount = (discountedPrice * 5 / 100);
			discountedPrice = discountedPrice - discountAmount;
			System.out.println("With code PROMO5, your total is = $" + discountedPrice);
			break;
		case "Promo10":
			discountAmount = (discountedPrice * 10 / 100);
			discountedPrice = discountedPrice - discountAmount;
			System.out.println("With code PROMO10, your total is = $" + discountedPrice);			
			break;
		case "Promo20":
			discountAmount = (discountedPrice * 20 / 100);
			discountedPrice = discountedPrice - discountAmount;
			System.out.println("With code PROMO20, your total is = $" + discountedPrice);
			break;
		default:
			System.out.println("After 50% discount, your total is = $" + discountedPrice);
		}
	}
}
