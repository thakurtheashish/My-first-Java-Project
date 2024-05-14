package assignment27april;

import java.util.Scanner;

/*Q1) Create a function that counts the number of syllables a word has. 
 * Each syllable is separated with a dash 
Examples
numberSyllables("buf-fet") ➞ 2
numberSyllables("beau-ti-ful") ➞ 3
numberSyllables("mon-u-men-tal") ➞ 4
numberSyllables("on-o-mat-o-poe-ia") ➞ 6
 */

public class CountSyllableMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word separated with dash to count syllables : ");
		String example = sc.next();

		CountSyllable cs = new CountSyllable();

		cs.numOfSyllable(example);

	}

}
