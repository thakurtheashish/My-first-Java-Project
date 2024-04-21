package assignmentWaterTank;

import java.util.Scanner;

/*There is a water tank of capacity 100 litres. Water is filled into it using bucket which have 
 * capacity of 10 litres.  Write a program which fills the tank to its capacity using these buckets.
 *  Also include a mechanism in your program to stop the tank from over flowing.
 */

public class waterTankFillingMainClass {

	public static void main(String[] args) {
		
		int bucketCapacity=10;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current level of tank (in litres) = ");
		int tankLevel = sc.nextInt();
int j = tankLevel + bucketCapacity;
		
			 for (int i = tankLevel; i <= 100 ; i = j+10)
				
				System.out.println("Drop bucket and tank level is = " + j + " litres");
			if (tankLevel == 100) {
				System.out.println("Tank is full");
			}
	}
}