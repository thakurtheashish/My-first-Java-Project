package package3_BankingAssignment;

import java.util.Scanner;

import package1_BankingAssignment.PersonDetails;

public class Main_Class {
	public static void main(String[] args) {
		PersonDetails user1 = new PersonDetails("John", "12345678", 1234, "98765432", "john9876", 650.79);

		BankOperations_Part3 operations = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the bank ");
		System.out.println("Which operation would you like to perform :");
		System.out.println("1. ATM              2. Online Banking");
		int operationSelected = sc.nextInt();
		boolean isUserValidated = false;

		switch (operationSelected) {
		case 1:
			operations = new ATM_Part3(user1.getFundsAvailable());
			isUserValidated = operations.validateDetails(user1.getAccountNum(), user1.getPin());
			break;

		case 2:
			operations = new Online_Part3(user1.getFundsAvailable());
			isUserValidated = operations.validateDetails(user1.getUserName(), user1.getPassword());
			break;

		default:
			System.out.println("Invalid entry, Please try again");
			break;
		}

		if (isUserValidated) {
			System.out.println("What transaction would you like to perform? Your options are :");
			System.out.println("A. Check Balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("D. Change Pin/Passwod");
			System.out.println("E. Exit");

			char optionSelected;

			do {
				System.out.print("Enter your option : ");
				optionSelected = sc.next().charAt(0);

				switch (optionSelected) {
				case 'A':
					operations.viewAvailableFunds();
					break;

				case 'B':
					System.out.print("Enter the amount to deposit : ");
					int amountToDeposit = sc.nextInt();
					operations.depositOperation(amountToDeposit);
					break;

				case 'C':
					System.out.print("Enter the amount to withdraw : ");
					int amountToWithdraw = sc.nextInt();
					operations.withdraw(amountToWithdraw);
					break;

				case 'D':
					if (operationSelected == 1) {
						String currentPin = Integer.toString(user1.getPin());
						operations.changePinPassword(currentPin);
					} else {
						operations.changePinPassword(user1.getPassword());
					}
					break;

				case 'E':
					System.out.println("You have exited the application. Have a Good day");
					break;

				default:
					System.out.println("Invalid Option! Please try again");
					break;

				}

			} while (optionSelected != 'E');
		}

	}
}
