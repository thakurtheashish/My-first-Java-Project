package assignment27april;

import java.util.Scanner;

/*
Create a function that removes the first and last characters from a string.
 Example : removeFirstLast("hello") ➞ "ell"
 removeFirstLast("a") ➞ "a"
 */
public class RemoceCharacterMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any word : ");
		String word = sc.nextLine();
		
		if (word.length() <= 2) {
			System.out.println("The outcome is :" + word);
		} else {
		System.out.println("After removing first and last character, the outcome is :"
				+ word.substring (1, (word.length() - 1)));
		}
		
		
	}
}
