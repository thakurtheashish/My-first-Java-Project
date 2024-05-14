package package1_BankingAssignment;

import java.util.Scanner;

public class PersonDetails {
	private String name;
	private String accountNum;
	private int pin;
	private String userName;
	private String password;
	private double fundsAvailable;
	
	public PersonDetails(String name, String accountNum, int pin, String userName, String password,
			double fundsAvailable) {
		super();
		this.name = name;
		this.accountNum = accountNum;
		this.pin = pin;
		this.userName = userName;
		this.password = password;
		this.fundsAvailable = fundsAvailable;
	}

	Scanner sc = new Scanner(System.in);
	
	public String getName() {
		return name;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public int getPin() {
		return pin;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public double getFundsAvailable() {
		return fundsAvailable;
	}
	
	public boolean validateDetails(String accountNum, int pin) {
		System.out.print("Please enter your account number : ");
		String accNumEntered = sc.nextLine();
		System.out.print("Please enter your PIN : ");
		int pinEntered = sc.nextInt();
		if ((accNumEntered.equals(this.accountNum)) && this.pin ==pinEntered) {
			return true;
		} else {
		System.out.println("Invalid credentials, please try again.");
		return false;
		}
	}
	
	public boolean validateDetails(String userName, String password) {
		System.out.print("Please enter your username : ");
		String userNameEntered = sc.nextLine();
		System.out.print("Please enter your Password : ");
		String passwordEntered = sc.nextLine();
		if ((userNameEntered.equals(userName)) && passwordEntered.equals(password)) {
			return true;
		} else {
			System.out.println("Invalid credentials, please try again.");
		return false;
		}
	}

	
	
	

}
