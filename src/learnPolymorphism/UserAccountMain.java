package learnPolymorphism;

import java.util.Scanner;

public class UserAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserAccount user = new UserAccount("987654321", 6541);
		
		user.setUserName("user123");
		user.setPassword("123xyz");
		
		Scanner sc = new Scanner (System.in);
		 System.out.println("Which operation you want to perform");
		 String opearationEntered = sc.next();
		 boolean isUserValidated = false;
		 
		 switch (opearationEntered) {
		case "ATM":
			user.validateUser("123456789", 4567);
			break;
		case "Online":
			user.validateUser("abcd", "123xyz");
			break;

		default:
			System.out.println("Invalid operation");
			break;
		}

		 if(isUserValidated) {
			 
		System.out.println("Balance : " + user.getBalance());
		 }
		 
	}

}
