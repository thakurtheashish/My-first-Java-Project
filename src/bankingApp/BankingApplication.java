package bankingApp;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankAccount bank = new BankAccount("Ashish","123456");
		bank.showMenu();
		

	}

}
