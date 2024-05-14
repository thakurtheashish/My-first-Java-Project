package encapsulationExample;

public class AccountDetailsMain {
	
	public static void main(String[] args) {
		
		AccountDetails swaroopAcc = new AccountDetails("12345678", 1234, 1234.56);
		
		System.out.println("Account Number is : " + swaroopAcc.getAccNum(1234));
		
		swaroopAcc.setBalance(520, 0234);
		System.out.println("Balance is : " + swaroopAcc.getBalance());
		
	}

}
