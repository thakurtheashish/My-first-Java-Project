package assignment27april;

import java.util.Scanner;

public class Prefix_Suffix_Main_Class {
/*Create two functions: isPrefix(word, prefix-) and isSuffix(word, -suffix).
isPrefix should return true if it begins with the prefix argument.
isSuffix should return true if it ends with the suffix argument.
Otherwise return false.
Examples : isPrefix("automation", "auto-") ➞ true
isSuffix("arachnophobia", "-phobia") ➞ true
isPrefix("retrospect", "sub-") ➞ false
isSuffix("vocation", "-logy") ➞ false
	 */

	public static void main(String[] args) {
		
		PrefixSuffixClass ps = new PrefixSuffixClass();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the word : ");
		
		String word = sc.nextLine();
		
		System.out.print("Enter the prefix/suffix : ");
		
		String prefixOrSuffix = sc.nextLine();
		
		if (ps.isPrefix(word, prefixOrSuffix)) {
			System.out.println("This word has prefix");
		} else if (ps.isSuffix(word, prefixOrSuffix)) {
			System.out.println("This word has suffix");
		} else {
			System.out.println("This word doesn't have prefix or a suffix");
		}
		

	}

}
