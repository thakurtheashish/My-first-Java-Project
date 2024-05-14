package abstraction;

public class RBC implements NBankInterface,CRA{

	@Override
	public void provideLoans() {
		// TODO Auto-generated method stub
		System.out.println("Interest at RBC is 7%");
		
	}

	@Override
	public void interestOnSavings() {
		// TODO Auto-generated method stub
		System.out.println("Savings interest at RBC is 2%");
		
	}

	@Override
	public void provideCheques() {
		// TODO Auto-generated method stub\
		System.out.println("No free cheques at RBC");
		
	}

	@Override
	public void linkAccountToSIN() {
	System.out.println("Need SIN to open account");
		
	}
	
	

}
