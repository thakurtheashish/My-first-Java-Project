package assignmentRides;

import java.util.Scanner;

public class AmusementParkRide {

	int seatsInRide;

	void heightCondition() {

		for (int counter = seatsInRide; counter < 10; counter++) {
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Enter your height = ");
			int height = sc1.nextInt();
			if (90 < height && height < 200) {
				System.out.println("You can sit in ride");
			}if (counter == 9) {
				System.out.println("Seats are full, please wait");
			} else if (height <= 90 || height >= 200) {
				System.out.println("You dont meet required height criteria");
				--counter;
			}
		}
	}
}