package assignmentLogin;

import java.util.Scanner;

/*Write a program which takes username and password from user via
console and compares it with a user name and password saved in 
your class. 
Saved user id and password are as below
UserId	pivotAdmin
password	Admin123

If the username and password entered by user matches with the
 one saved in your class, then print “You are logged in to the 
 application“ other wise  print “Incorrect User id or password.
 Try again”.  Also a user gets 3 chances enter the correct user
  name and password. If the user enters incorrect user name or 
  password more than 3 times then print “ Account locked” 
*/
public class MainClassForLogin {

	public static void main(String[] args) {

		String userIDDefault = "pivotAdmin";
		String passwordDefault = "Admin123";
		int attempts = 3;

		for (int counter = 0; counter < 3; counter++) {

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter userID = ");
			String enteredUserID = sc.nextLine();

			System.out.print("Enter password = ");
			String enteredPassword = sc.nextLine();

			if (enteredUserID.equals(userIDDefault) && enteredPassword.equals(passwordDefault)) {
				System.out.println("You are logged in to the application");
				break;
			}
			attempts--;
			if (counter < 3 && attempts > 0) {
				System.out.println("Incorrect User id or password. Try again");
				System.out.println("Number of attempts remaining : " + attempts);

			} else if (attempts == 0) {
				System.out.println("Incorrect User id or password. Account Locked");
			}
		}

	}

}