package abstraction;

public interface NBankInterface extends FinancialTransaction{
	
    String name = "National Bank";	
//	
//    public void provideLoans();
//	
//   	public abstract void interestOnSavings();
//   	
//   	public abstract void provideCheques();
//	
	//To put some features later in future we can do that
	public default void method() {
		System.out.println("Inside Default");
	}

}
