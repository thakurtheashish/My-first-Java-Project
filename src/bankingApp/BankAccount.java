package bankingApp;

import java.util.Scanner;

public class BankAccount {
	
	double balance;
	double previousTransaction;
	String customerName;
	String customerID;
	
	
	
	public BankAccount(String customerName, String customerID) {
		super();
		this.customerName = customerName;
		this.customerID = customerID;
	}

	void deposit(double amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(double amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPrevioudTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited : " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn : " + Math.abs(previousTransaction)); // convert negative value to positive value
		} else {
			System.out.println("No transaction occured!");
		}
	}
	
	void showMenu() {
		char option = '\0';
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome "+ customerName);
		System.out.println("Your ID is : " + customerID);
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Check previous transaction");
		System.out.println("E. Exit");
		do {
			System.out.println("==========================");
			System.out.println("Enter the option");
			System.out.println("==========================");
			System.out.println();
			option = sc.next().charAt(0);
			Character.toUpperCase(option); // converts lower case to upper case
			
			switch(option) {
			case 'A':
				System.out.println("==========================");
				System.out.println("Balance is : " +balance );
				System.out.println("==========================");
				break;
			case 'B' : 
				System.out.println("==========================");
				System.out.println("Enter the amount to deposit : ");
				System.out.println("==========================");
				int amount =sc.nextInt();
						deposit(amount);
				break;
				
			case 'C' :
				System.out.println("==========================");
				System.out.println("Enter the amount to withdraw : ");
				System.out.println("==========================");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				break;
				
			case 'D' :
				System.out.println("==========================");
				getPrevioudTransaction();	
				System.out.println("==========================");
				break;
				
			case 'E' :	
				
				System.out.println("==========================");
				break;
				
			default:
				System.out.println("Invalid Option! Please try again");
				break;
			}
		} while (option != 'E');
	}
	
	

}
