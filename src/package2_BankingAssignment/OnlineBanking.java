package package2_BankingAssignment;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {

	protected OnlineBanking(double fundsAvailable) {
		super(fundsAvailable);
		// TODO Auto-generated constructor stub
	}
	Scanner sc = new Scanner(System.in);
	@Override
	public void changePinPassword(String pinPassword) {
		System.out.println("Enter the new Password : ");
		String newPinPassword = sc.nextLine();
		
		while(pinPassword.equals(newPinPassword) || newPinPassword.length() < 8 || newPinPassword.contains("$")
				|| newPinPassword.contains("&") || newPinPassword.contains("@")) {
			System.out.println("Invalid new password, please re-enter the password : ");
			newPinPassword = sc.nextLine();
		}
		pinPassword = newPinPassword;
		System.out.println("Password updated successfully.");
	}

}
