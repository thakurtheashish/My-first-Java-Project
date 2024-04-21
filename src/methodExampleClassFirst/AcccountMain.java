package methodExampleClassFirst;

import java.util.Scanner;

public class AcccountMain {

	public static void main(String[] args) {

		Account jerinAccount = new Account();
		jerinAccount.accountNumber = "12345678";
		jerinAccount.accountType = "Saving";
		jerinAccount.balance = 4561.97;
		jerinAccount.pin = 1234;
		jerinAccount.nameOfAccountHolder = "Jerin Raj";

		//System.out.println("Jerin Account : " + jerinAccount.getAccountNumber());

		Account ravneetAccount = new Account();
		ravneetAccount.accountNumber = "87654321";
		ravneetAccount.accountType = "Chequing";
		ravneetAccount.balance = 5561.97;
		ravneetAccount.pin = 4321;
		ravneetAccount.nameOfAccountHolder = "Ravneet Kaur";

		Account rajinderAccount = new Account();
		rajinderAccount.accountNumber = "43218765";
		rajinderAccount.accountType = "Chequing";
		rajinderAccount.balance = 6561.97;
		rajinderAccount.pin = 9876;
		rajinderAccount.nameOfAccountHolder = "Rajinder Kaur";

		Account[] accounts = { jerinAccount, ravneetAccount, rajinderAccount };

	//	System.out.println(accounts[0].getBalance());
		// System.out.println(accounts[2].getAccountNumber());

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number : ");
		String accountNumEntered = sc.next();

		System.out.println("Enter your PIN : ");
		int pinEntered = sc.nextInt();

//		for (int i = 0; i<accounts.length; i++) {
//			if (accounts[i].getAccountNumber().equals(accountNumEntered)) {
//				
//				boolean isPINValid = accounts[i].validatePIN(pinEntered);
//				
//				if(isPINValid) {
//				System.out.println("Account holder name: " + accounts[i].getNameOfAccountHolder());
//				System.out.println("Account Type : " + accounts[i].getAccountType());
//				System.out.println("Account Balance : " + accounts[i].getBalance());
//				break;
//				}else {
//					System.out.println("PIN is not correct");
//				}
//			}
//		}
//	}

//		boolean isAccountValidated = false;
//		
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i].validateCredentials(accountNumEntered, pinEntered)) {
//				System.out.println("Account holder name: " + accounts[i].getNameOfAccountHolder());
//				System.out.println("Account Type : " + accounts[i].getAccountType());
//				System.out.println("Account Balance : " + accounts[i].getBalance());
//				isAccountValidated = true;
//				break;
//				} 
//			}
//		if (!isAccountValidated) {
//				System.out.println("Accounts details incorrect");
//		}

//		Account account = new Account();
//
//		account = account.getAccountIfValidCredentials(accountNumEntered, pinEntered, accounts);
//
//		System.out.println("Account holder name: " + account.getNameOfAccountHolder());
//		System.out.println("Account Type : " + account.getAccountType());
//		System.out.println("Account Balance : " + account.getBalance());

		Account validatedAccount = new Account();

		validatedAccount = validatedAccount.getAccountIfValidCredentials(accountNumEntered, pinEntered, accounts);
		validatedAccount.displayAccountDetails();


	}

}
