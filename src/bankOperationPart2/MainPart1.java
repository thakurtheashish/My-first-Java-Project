package bankOperationPart2;

import java.util.Scanner;

import operationsOnATM.ATMOperations;

public class MainPart1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PersonalDetails user1 = new PersonalDetails("Alex", "12345678", 750.47, "9876", "xyz987", "Abcd1234");
		System.out.println("Welcome to the banking system " + user1.getNameOfAccountHolder());

		System.out.print("What operations would you like to perform: ATM or Online Banking : ");
		String selectedOperations = sc.nextLine();

		boolean isUserValidated = false;

		ATM atm = new ATM(user1.getAvailableFunds(), user1.getAccountNumber(), user1.getPin());
		OnlineBanking online = new OnlineBanking(user1.getAvailableFunds(), user1.getOnlineBankingUsername(),
				user1.getOnlineBankingPassword());

		switch (selectedOperations) {
		case "ATM":
			isUserValidated = atm.validateAccount();
			break;

		case "Online Banking":
			isUserValidated = online.validateAccount();
			break;

		default:
			System.out.println("Invalid Operation");
			break;
		}

		if (isUserValidated) {
			System.out.println("What transaction would you like to perform?");
			System.out.println("Your options are :");
			System.out.println("A. Check Balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("D. Change Pin or Password ");
			System.out.println("E. Exit");

			char optionSelected;
			do {
				System.out.println("Enter your option : ");
				optionSelected = sc.next().charAt(0);

				switch (optionSelected) {
				case 'A':
					if (selectedOperations.equals("ATM")) {
						atm.viewAvailableFunds();
					} else if (selectedOperations.equals("Online Banking")) {
						online.viewAvailableFunds();
					}
					break;

				case 'B':
					System.out.print("Enter the amount to deposit : ");
					int amountToDeposit = sc.nextInt();
					if (selectedOperations.equals("ATM")) {
						atm.depositOperation(amountToDeposit);
					} else if (selectedOperations.equals("Online Banking")) {
						online.depositOperation(amountToDeposit);
					}
					break;

				case 'C':
						if (selectedOperations.equals("ATM")) {
								System.out.print("Enter the amount to withdraw : ");
								int amountToWithdraw = sc.nextInt();
								if (amountToWithdraw < atm.dailyWithdrawalLimit()) {
										atm.withdrawOperation(amountToWithdraw);
									} else {
										System.out.println("The entered amount is above the allowed limit of $5000");
									}
							} else if (selectedOperations.equals("Online Banking")) {
							System.out.print("Enter the amount to withdraw : ");
							int amountToWithdraw = sc.nextInt();
						if (amountToWithdraw < online.dailyWithdrawalLimit()) {
							online.withdrawOperation(amountToWithdraw);
						} else {
							System.out.println("The entered is amount the above daily allowed limit of $5000");
						}
					} 
					break;

				case 'D':
					if (selectedOperations.equals("ATM")) {
						atm.changePinPassword();
					} else if (selectedOperations.equals("Online Banking")) {
						online.changePinPassword();
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
}}