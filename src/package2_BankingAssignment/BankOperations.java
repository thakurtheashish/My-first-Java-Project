package package2_BankingAssignment;

public abstract class BankOperations{
	
	protected double fundsAvailable;
	
	protected BankOperations(double fundsAvailable) {
		super();
		this.fundsAvailable = fundsAvailable;
	}
	
	public void withdraw(double amountToWithdraw) {
		if (amountToWithdraw <= 0) {
			System.out.println("Transaction failed. Enter correct amount");
		}  else if (fundsAvailable > amountToWithdraw) {
			fundsAvailable -= amountToWithdraw;
			System.out.println("After withdrawal, the remaining balance is : $" + fundsAvailable);
		} else {
			System.out.println("Insufficent Funds, Please try later");
		}
		}
	
	public void depositOperation(double amountToDeposit) {
		if (amountToDeposit > 0) {
			fundsAvailable += amountToDeposit;
		System.out.println("After deposit, the balance in your account is : $" + fundsAvailable);
	} else {
		System.out.println("Transaction failed. Enter correct amount");
	}
}	

	public void viewAvailableFunds() {
		
		System.out.println("The available balance is : " + fundsAvailable);
	}
	
	public abstract void changePinPassword(String pinPassword);


	

}
