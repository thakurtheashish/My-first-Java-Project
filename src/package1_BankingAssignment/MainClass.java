package package1_BankingAssignment;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		BankOperation operations = null;

		Scanner sc = new Scanner(System.in);

		PersonDetails user1 = new PersonDetails("John", "12345678", 1234, "98765432", "john9876", 650.79);
		System.out.println("Welcome to the bank " + user1.getName());
		System.out.println("Which operation would you like to perform :");
		System.out.println("1. ATM              2. Online Banking");
		int operationSelected = sc.nextInt();
		boolean isUserValidated = false;

		switch (operationSelected) {
		case 1:
			operations = new ATM(user1.getFundsAvailable());
			isUserValidated = user1.validateDetails(user1.getAccountNum(), user1.getPin());
			break;

		case 2:
			operations = new OnlineBanking(user1.getFundsAvailable());
			isUserValidated = user1.validateDetails(user1.getUserName(), user1.getPassword());
			break;

		default:
			System.out.println("Invalid entry, Please try again");
			break;
		}

		if (isUserValidated) {
			System.out.println("User has been verified. ");
			System.out.println("What transaction would you like to perform? Your options are :");
			System.out.println("A. Check Balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("D. Exit");

			char optionSelected;
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
				System.out.println("You have exited the application. Have a Good day");
				break;

			default:
				System.out.println("Invalid Option! Please try again");
				break;

			}

		}
	}
}