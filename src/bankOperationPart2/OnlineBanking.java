package bankOperationPart2;

import java.util.Scanner;

public class OnlineBanking extends BankingRules implements BankOperations {
	
	Scanner sc = new Scanner(System.in);
	
	   private double availableFunds;
	   private String onlineBankingUsername;
	   private String onlineBankingPassword;

	public OnlineBanking(double availableFunds, String onlineBankingUsername, String onlineBankingPassword) {
		super();
		this.availableFunds = availableFunds;
		this.onlineBankingUsername = onlineBankingUsername;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	
	public boolean validateAccount() {
		int pinAttempt = 0;
		boolean isUserValidated = false;
		while (pinAttempt < 3 && !isUserValidated) {
			System.out.print("Enter the user number : ");
			String usernameEntered = sc.nextLine();
			System.out.print("Enter the password : ");
			String passwordEntered = sc.nextLine();
			if (onlineBankingUsername.equals(usernameEntered) && passwordEntered.equals(passwordEntered)) {
				System.out.println("Credentials have been verified.");
				isUserValidated = true;
			} else {
				pinAttempt++;
				int attemptLeft = 3 - pinAttempt;
				if (pinAttempt >= 3) {
					System.out.println("The system has been locked. Please contact your bank.");
				} else {
					System.out.println("Invalid Password, you have " + attemptLeft + " pending");
				}
				
	}
		} return isUserValidated;
	}
	

	public void changePinPassword() {
		
		System.out.println("Enter the new Password : ");
		String newPinPassword = sc.nextLine();
		
		while(onlineBankingPassword.equals(newPinPassword) || newPinPassword.length() < 8 || newPinPassword.contains("$")
				|| newPinPassword.contains("&") || newPinPassword.contains("@")) {
			System.out.println("Invalid new password, please re-enter the password : ");
			newPinPassword = sc.nextLine();
		}
		onlineBankingPassword = newPinPassword;
		System.out.println("Password updated successfully.");
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
	}}

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
		System.out.println("The available balance is : " + availableFunds);		
	}

	@Override
	public double dailyWithdrawalLimit() {
		// TODO Auto-generated method stub
		return 5000;
	}

}
