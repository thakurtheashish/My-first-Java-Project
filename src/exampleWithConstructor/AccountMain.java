package exampleWithConstructor;

public class AccountMain {

	public static void main(String[] args) {
		
		Account jerin = new Account("Jerin", "Chequing", "123456", 5875.32, 1234);
		
		System.out.println("Name of account holder "  + jerin.getNameOfAccountHolder());
		
		
		Account ravneet = new Account("Ravneet", "Chequing", "653456", 8775.32, 4321);
		
		
		Account  account1 = new Account();
		
		System.out.println(account1.getBalance());
		
		
		
		
	}
}

		
