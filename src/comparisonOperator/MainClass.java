package comparisonOperator;

public class MainClass {

	public static void main(String[] args) {
		ComparisonOperator co = new ComparisonOperator ();
		co.validPin = 1234;
		co.enteredPin = 1234;
		co.balanceAvailable =198.27;
		co.amountEnteredToWithdraw = 150;
		co.validatingPin();
	    co.cashTransaction();
	}


}
