package assignment27april;

import java.util.Scanner;

/*Create a method that accepts a string (of a person's first and last name)
 *  and returns a string with the first and last name swapped.
 *
Examples
nameShuffle("Donald Trump") ➞ "Trump Donald"
*/

public class SwapNameMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first and last name separated by space : ");
		String name = sc.nextLine();
		String [] nameArray = name.split(" ");
		//String swapName = name
		System.out.println("After swap, the name is : " + nameArray[1] + " " + nameArray[0]);
		
		
		

	}

}
