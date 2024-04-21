package exampleWithConstructor;

public class Account {

	String nameOfAccountHolder;
	String accountType;
	String accountNumber;
	double balance;
	int pin;

	public Account(String nameOfAccountHolder, String accountType, String accountNumber, double balance, int pin) {
		super();
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
	}
	
	public Account() {
		
	}
	
	
	public String getNameOfAccountHolder() {
		return nameOfAccountHolder;             // syntax of method with return type
	}                                           // Public returnType nameofMethod(){
                                                //  return returnType;}
	public double getBalance() {
		return balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int pinOfAccount() {
		return pin;
	}

	public boolean validatePIN(int pinEntered) {            // syntax with arguments or parameters
						                       // Public returnType nameOfMethod(arguments....)
		if (pin == pinEntered) {
			return true;                                       
		} else {
			return false;
		}
	}
	
	public boolean validateAccountNumber(String accountNumEntered, int pinEntered) {
		if (accountNumber.equals(accountNumEntered)) {
			if (validatePIN(pinEntered)) {
			return true;
		}}
		return false;
	}
}
