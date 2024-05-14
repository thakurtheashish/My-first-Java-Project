package abstraction;

public class CIBC extends NationalBank implements BrokerageRules, Forex, CRA{

	@Override
	public void interestOnSavings() {
		// TODO Auto-generated method stub
		System.out.println("Provide interest on savings at CIBC at 1%");
	}
	
	public void provideLoans() {
		System.out.println("Interest rate on loan at CIBC is 7%");
	}

	@Override
	public void buyStcoks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellStocks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chargeFee() {
		// TODO Auto-generated method stub
		System.out.println("Mutual Fund fee at CIBC is 2.1%");
	}

	@Override
	public void sendMoney() {
		// TODO Auto-generated method stub
		System.out.println("Cost for sending money at CIBC is $1.99 per transaction");
	}

	@Override
	public void receiveMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void provideCheques() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void linkAccountToSIN() {
		// TODO Auto-generated method stub
		
	}

}
