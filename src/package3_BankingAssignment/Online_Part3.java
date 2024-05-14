package package3_BankingAssignment;

import java.util.Scanner;

public class Online_Part3 extends BankingRules implements BankOperations_Part3 {

	protected double fundsAvailable;
	Scanner sc = new Scanner(System.in);

	protected Online_Part3(double fundsAvailable) {
		super();
		this.fundsAvailable = fundsAvailable;
	}

	@Override
	public void withdraw(double amountToWithdraw) {
		if (amountToWithdraw <= 0) {
			System.out.println("Invalid Amount to withdraw");
		} else if (fundsAvailable > amountToWithdraw) {
			fundsAvailable -= amountToWithdraw;
			System.out.println("After withdrawal, the remaining balance is : $" + fundsAvailable);
		} else {
			System.out.println("Insufficent Funds");
		}
	}

	@Override
	public void depositOperation(double amountToDeposit) {
		if (amountToDeposit > 0) {
			fundsAvailable += amountToDeposit;
			System.out.println("After deposit, the balance in your account is : $" + fundsAvailable);
		} else {
			System.out.println("Transaction failed. Enter correct amount");
		}
	}

	@Override
	public void viewAvailableFunds() {
		System.out.println("The available balance is : " + fundsAvailable);
	}

	@Override
	public void changePinPassword(String onlineBankingPassword) {
		System.out.println("Enter the new Password : ");
		String newPinPassword = sc.nextLine();

		while (onlineBankingPassword.equals(newPinPassword) || newPinPassword.length() < 8
				|| newPinPassword.contains("$") || newPinPassword.contains("&") || newPinPassword.contains("@")) {
			System.out.println("Invalid new password, please re-enter the password : ");
			newPinPassword = sc.nextLine();
		}
		onlineBankingPassword = newPinPassword;
		System.out.println("Password updated successfully.");
	}

	@Override
	public boolean validateDetails(String accountNum, int pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateDetails(String userName, String password) {
		int pinAttempt = 0;
		boolean isUserValidated = false;
		while (pinAttempt < 3 && !isUserValidated) {
			System.out.print("Enter the user number : ");
			String usernameEntered = sc.nextLine();
			System.out.print("Enter the password : ");
			String passwordEntered = sc.nextLine();
			if (userName.equals(usernameEntered) && password.equals(passwordEntered)) {
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
		}
		return isUserValidated;
	}

	@Override
	public int dailyWithdrawalLimit() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public void transactionLimit() {
		// TODO Auto-generated method stub

	}

}
