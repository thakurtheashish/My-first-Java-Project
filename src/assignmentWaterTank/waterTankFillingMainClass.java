package assignmentWaterTank;

import java.util.Scanner;

/*There is a water tank of capacity 100 litres. Water is filled into it using bucket which have 
 * capacity of 10 litres.  Write a program which fills the tank to its capacity using these buckets.
 *  Also include a mechanism in your program to stop the tank from over flowing.
 */

public class waterTankFillingMainClass {

	public static void main(String[] args) {
		
		waterTank wt = new waterTank();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current level of tank (in litres) = ");
		int tankLevel = sc.nextInt();
		
		wt.tankWaterLevel = tankLevel;
		

		if (tankLevel % 2 == 0 && tankLevel % 5 == 0) {
			wt.checkWaterLevel();

	} else {
		System.out.println("Invalid Entry");
	}
}
}