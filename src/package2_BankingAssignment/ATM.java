package package2_BankingAssignment;

import java.util.Scanner;

public class ATM extends BankOperations{

	    Scanner sc = new Scanner(System.in);
	
	
		protected ATM(double fundsAvailable) {
		super(fundsAvailable);
		// TODO Auto-generated constructor stub
	}

		@Override
	public void changePinPassword(String pin) {
			System.out.println("Enter the new PIN : ");
			String newPinPassword = sc.nextLine();
		 
			while (((pin.equals(newPinPassword)) || (newPinPassword.length() != 4))){
				System.out.println("Invalid PIN selection, please re-enter the PIN : ");
				newPinPassword = sc.nextLine();
			}
			
	        pin = newPinPassword;
	        System.out.println("PIN updated successfully.");
	    
		
	}

	

}
