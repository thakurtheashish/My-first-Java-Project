package package3_BankingAssignment;

import java.util.Scanner;

public class ATM_Part3 extends BankingRules implements BankOperations_Part3 {

	protected double fundsAvailable;
	Scanner sc = new Scanner(System.in);
	int totalWithdraw = 0;

	public ATM_Part3(double fundsAvailable) {
		// TODO Auto-generated constructor stub
		this.fundsAvailable = fundsAvailable;
	}

	@Override
	public void withdraw(double amountToWithdraw) {

		if (amountToWithdraw > dailyWithdrawalLimit() || totalWithdraw > dailyWithdrawalLimit()) {
			System.out.println("This withdrawal is more than daily limit allowed. Try Again");
		} else if (amountToWithdraw <= 0) {
			System.out.println("Invalid amount to withdraw");
		} else if (amountToWithdraw > fundsAvailable) {
			System.out.println("Insufficent Funds, Please Try Again");
		} else if (fundsAvailable > amountToWithdraw) {
			totalWithdraw += amountToWithdraw;
		}
		if (totalWithdraw <= dailyWithdrawalLimit()) {
			fundsAvailable -= amountToWithdraw;
			System.out.println("After withdrawal, the remaining balance is : $" + fundsAvailable);
		} else {
			System.out.println("You have reached daily limit");
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
	public void changePinPassword(String pin) {
		System.out.println("Enter the new PIN : ");
		String newPinPassword = sc.nextLine();

		while (((pin.equals(newPinPassword)) || (newPinPassword.length() != 4))) {
			System.out.println("Invalid PIN selection, please re-enter the PIN : ");
			newPinPassword = sc.nextLine();
		}

		pin = newPinPassword;
		System.out.println("PIN updated successfully.");

	}

	public boolean validateDetails(String accountNum, int pin) {
		int pinAttempt = 0;
		boolean isUserValidated = false;
		while (pinAttempt < 3 && !isUserValidated) {
			System.out.print("Enter the account number : ");
			String accountNumberEntered = sc.next();
			System.out.print("Enter the pin : ");
			int pinEntered = sc.nextInt();
			if (accountNum.equals(accountNumberEntered) && pin == pinEntered) {
				System.out.println("Credentials have been verified.");
				isUserValidated = true;
			} else {
				pinAttempt++;
				int attemptLeft = 3 - pinAttempt;
				if (pinAttempt >= 3) {
					System.out.println("The system has been locked. Please contact your bank.");
				} else {
					System.out.println("Invalid PIN, you have " + attemptLeft + "  attempts pending");
				}
			}
		}
		return isUserValidated;
	}

	@Override
	public boolean validateDetails(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
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
