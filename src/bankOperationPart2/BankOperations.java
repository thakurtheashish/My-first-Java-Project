package bankOperationPart2;

public interface BankOperations {

	public void withdrawOperation(double amountToWithdraw);

	public void depositOperation(double amountToDeposit);

	public void viewAvailableFunds();

	public void changePinPassword();

}
