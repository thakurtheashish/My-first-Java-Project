package encapsulationExample;

public class AccountDetails {
	
	private String accountNumber;
	private int pinNumber;
	private double balance;
	
	public AccountDetails(String accountNumber, int pinNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.pinNumber = pinNumber;
		this.balance = balance;
	}
	
	public String getAccNum(int pinEntered) {
		if(validatePin(pinNumber)) {
		return accountNumber;
	}
		return "";
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setPinNumber(int pinNumber, int pinEntered) {
		if (validatePin(pinEntered)) {
		this.pinNumber = pinNumber;
	} else {
		System.out.println("This is not correct");
	}
	}
	
	public void setBalance(int balance, int pinentered) {
		if (validatePin(pinentered)) {
		this.balance = balance;
	} else {System.out.println("Incorrect pin");
	}
	}

	public boolean validatePin (int pinEntered) {
		if (this.pinNumber == pinEntered) {
			return true;
		}
		return false;
	}
}
