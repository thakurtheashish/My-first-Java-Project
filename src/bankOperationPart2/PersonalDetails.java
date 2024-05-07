package bankOperationPart2;

public class PersonalDetails {

	private String nameOfAccountHolder;
	private String accountNumber;
	private double availableFunds;
	private String pin;
	private String onlineBankingPassword;
	private String onlineBankingUsername;

	public PersonalDetails(String nameOfAccountHolder, String accountNumber, double availableFunds, String pin,
			String onlineBankingUsername, String onlineBankingPassword) {
		super();
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.accountNumber = accountNumber;
		this.availableFunds = availableFunds;
		this.pin = pin;
		this.onlineBankingUsername = onlineBankingUsername;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public double getAvailableFunds() {
		return availableFunds;
	}

	public String getPin() {
		return pin;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}

	public String getNameOfAccountHolder() {
		return nameOfAccountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getOnlineBankingUsername() {
		return onlineBankingUsername;
	}
	
	public void setPin(String pin) {
		this.pin = pin;
	}

	public void setOnlineBankingPassword(String onlineBankingPassword) {
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public void changePinPassword(String oldPinPassword, String newPinPassword) {
		// TODO Auto-generated method stub
		
	}

}
