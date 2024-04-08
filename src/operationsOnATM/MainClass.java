package operationsOnATM;

public class MainClass {

	public static void main(String[] args) {
		ATMOperations co = new ATMOperations ();
		co.validPin = 1234;
		co.enteredPin = 1234;
		co.balanceAvailable =198.27;
		co.amountEnteredToWithdraw = 155;
		co.validatingPin();
	  if (co.validPin == co.enteredPin) {
		  co.cashTransaction();
		  co.remainingBalance();
	  }
	}


}
