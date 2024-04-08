package discountOnProducts;

public class DiscountOnProducts {
	double originalAmount, discountedPrice, discountAmount;
	String promoCode;

	void discountForEveryone() {
		discountAmount = (originalAmount * 50 / 100);
		discountedPrice = (originalAmount - discountAmount);
			System.out.println("After 50% Discount, Your Total is = $" + discountedPrice);	
		 if (promoCode.equals("Promo5")) {
			discountAmount = (discountedPrice * 5 / 100);
			discountedPrice = discountedPrice - discountAmount;
			System.out.println("With code PROMO5, your total is =$" + discountedPrice);
		} else if (promoCode.equals("Promo10")) {
			discountAmount = (discountedPrice * 10 / 100);
			discountedPrice = discountedPrice - discountAmount;
			System.out.println("With code PROMO10, your total is =$" + discountedPrice);
		} else if (promoCode.equals("Promo20")) {
			discountAmount = (discountedPrice * 20 / 100);
			discountedPrice = discountedPrice - discountAmount;
			System.out.println("With code PROMO20, your total is =$" + discountedPrice);
		}

	}

}
