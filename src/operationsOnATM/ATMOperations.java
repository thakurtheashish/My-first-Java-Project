package operationsOnATM;

public class ATMOperations {
	double balanceAvailable, balanceLeft;
	int amountEnteredToWithdraw, enteredPin, validPin, d;
	

	void validatingPin() {
		if (enteredPin == validPin) {
			System.out.println("PIN is valid");
			System.out.println("Available Balance = " + balanceAvailable);
			System.out.println("Enter amount you wish to Withdraw = " + amountEnteredToWithdraw);
		} else {
			System.out.println("Invalid PIN, Please try again");
		}
	}

	void cashTransaction() {
		d = amountEnteredToWithdraw % 5;
		if ((balanceAvailable >= amountEnteredToWithdraw) && (d == 0) && (enteredPin == validPin)) {
			System.out.println("Withdrawal request will be completed");
		}
		else {
			System.out.println("Insufficient/Incorrect Balance, Please Try Again");
		
		}
	}
	
	void remainingBalance() {
		balanceLeft = balanceAvailable - amountEnteredToWithdraw;
		System.out.println("Remaining Balance is = " + balanceLeft);
	}
}
