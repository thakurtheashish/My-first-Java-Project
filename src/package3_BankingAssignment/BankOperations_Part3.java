package package3_BankingAssignment;

public interface BankOperations_Part3 {

	public void withdraw(double amountToWithdraw);

	public void depositOperation(double amountToDeposit);

	public void viewAvailableFunds();

	public void changePinPassword(String currentPin);

	public boolean validateDetails(String accountNum, int pin);

	public boolean validateDetails(String userName, String password);

}
