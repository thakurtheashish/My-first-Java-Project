package bankOperationPart2;

import java.util.Scanner;

public class ATM extends BankingRules implements BankOperations{
	
	
	Scanner sc = new Scanner(System.in);
	private String newPinPassword;
    private double availableFunds;
    private String accountNumber;
    private String pin;

   public ATM(double availableFunds, String accountNumber, String pin) {
        this.availableFunds = availableFunds;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }
	 public void changePinPassword() {
		 
			System.out.println("Enter the new PIN : ");
			String newPinPassword = sc.nextLine();
		 
			while (((pin.equals(newPinPassword)) || (newPinPassword.length() != 4))){
				System.out.println("Invalid PIN selection, please re-enter the PIN : ");
				newPinPassword = sc.nextLine();
			}
	      
	        pin = newPinPassword;
	        System.out.println("PIN updated successfully.");
	    }

	public boolean validateAccount() {
		int pinAttempt = 0;
		boolean isUserValidated = false;
		while (pinAttempt < 3 && !isUserValidated) {
			System.out.print("Enter the account number : ");
			String accountNumberEntered = sc.nextLine();
			System.out.print("Enter the pin : ");
			String pinEntered = sc.nextLine();
			if (accountNumber.equals(accountNumberEntered) && pin.equals(pinEntered)) {
				System.out.println("Credentials have been verified.");
				isUserValidated = true;
			} else {
				pinAttempt++;
				int attemptLeft = 3 - pinAttempt;
				if (pinAttempt >= 3) {
					System.out.println("The system has been locked. Please contact your bank.");
				} else {
					System.out.println("Invalid PIN, you have " + attemptLeft + " pending");
				}
				
	}
		} return isUserValidated;
	}

	@Override
	public void withdrawOperation(double amountToWithdraw) {
	if (amountToWithdraw <= 0) {
		System.out.println("Invalid Amount to withdraw");
	}
	if (availableFunds > amountToWithdraw) {
		availableFunds -= amountToWithdraw;
		System.out.println("After withdrawal, the remaining balance is : $" + availableFunds);
	} else {
		System.out.println("Insufficent Funds");
	}
	}

	@Override
	public void depositOperation(double amountToDeposit) {
		if (amountToDeposit > 0) {
		availableFunds += amountToDeposit;
		System.out.println("After deposit, the balance in your account is : $" + availableFunds);
	} else {
		System.out.println("Deposit failed. Enter correct amount");
	}
}	

	@Override
	public void viewAvailableFunds() {
		// TODO Auto-generated method stub
		System.out.println("The available balance is : " + availableFunds);
	}

	@Override
	public double dailyWithdrawalLimit() {
		// TODO Auto-generated method stub
		return 500;
	}
}
