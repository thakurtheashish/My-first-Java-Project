package abstraction;

public class BankMain {
	public static void main(String[] args) {
		
		//Can't initiate an abstract class
	//	NationalBank sbi = new NationalBank();
		// sbi.interestOnSavings;
		
//		NationalBank cibc = new CIBC();
//		
//		// reference variable of parent class, referring to object of TD
//		NationalBank td = new TD();  
//		TD td1 = new TD (); // Reference variable of same class
//		
//		cibc.interestOnSavings();
//		cibc.provideLoans();
//		System.out.println();
//		
//		td.interestOnSavings();
//		td.provideLoans();
//		td.provideCheques();
		
		RBC rbc = new RBC();
		rbc.interestOnSavings();
		rbc.linkAccountToSIN();

		NBankInterface rbc2 = new RBC();
		rbc2.interestOnSavings();
		rbc2.method();
		
		// we can't do this as this method is exclusive to child class only
		//rbc2.linkAccountToSin(); 
		
		CRA rbc3 = new RBC();
		rbc3.linkAccountToSIN();
		rbc3.interestOnSavings();
		
		FinancialTransaction rbc4 = new RBC();
		rbc4.interestOnSavings();
		rbc4.linkAccountToSIN();
	}
}
