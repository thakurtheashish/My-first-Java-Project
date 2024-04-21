package methodExampleClassFirst;

public class Account {

	String nameOfAccountHolder;
	String accountType;
	String accountNumber;
	double balance;
	int pin;

	public String getNameOfAccountHolder() {
		return nameOfAccountHolder;                                // syntax of method with return type
	}                                                             // Public returnType nameofMethod(){
		                                                          // return returnType;
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

	public boolean validatePIN(int pinEntered) {                   // syntax with arguments or parameters
		                                                            // Public returnType nameOfMethod(arguments....)
		if (pin == pinEntered) {
			return true;
		}
		return false;
	}

	public boolean validateCredentials(String accountNumEntered, int pinEntered) {
		if (accountNumber.equals(accountNumEntered)) {
			if (validatePIN(pinEntered)) {
				return true;
			}
		}
		return false;
	}
	
	public Account getAccountIfValidCredentials(String accountNumEntered, int pinEntered, Account [] accounts) {
		
		for (int i = 0; i< accounts.length; i++)
		if (accounts[i].getAccountNumber().equals(accountNumEntered)) {
			 if (accounts[i].validatePIN(pinEntered)) {
				 return accounts[i];
			 }
		}
		return null; 
	}

	public void displayAccountDetails() {
		System.out.println("Account holder name: " + getNameOfAccountHolder());
		System.out.println("Account Type : " + getAccountType());
		System.out.println("Account Balance : " + getBalance());
	}
	
	
	
}
