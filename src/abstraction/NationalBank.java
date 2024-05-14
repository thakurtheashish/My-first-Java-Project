package abstraction;

public abstract class NationalBank {
	
	double balance;
	
	public void provideLoans() {
		System.out.println("The interest on loans at 5.00%");
	}
	
	public abstract void interestOnSavings();
	
	public abstract void provideCheques();

}
