package justTry;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms in series : ");
		int num = sc.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		int thirdterm;
		
		System.out.println(firstTerm + " " + secondTerm + " ");
		
		for (int i=3; i <= num; i++) {
			thirdterm = firstTerm + secondTerm;
			System.out.println(thirdterm+" ");
			firstTerm = secondTerm;
			secondTerm = thirdterm;
			
		}
		
	}
}
