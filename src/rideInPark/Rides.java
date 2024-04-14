package rideInPark;
/*In Amusement park, a ride can carry max 10 people. Write a code 
 * to help the operator from overfilling the ride i.e  more than 
 * 10 people should not be allowed to get on the ride.  Also
 *  ensure that the people getting on the ride meets the height 
 *  criteria , Height of person 
 * should be greater than 90 cm but less than 200 cm.
 * */

public class Rides {
	int[] personInLine = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
	int[] height = { 94, 93, 82, 97, 97, 99, 100, 94, 174, 101, 188, 199, 171, 206, 111, 99, 105, 99, 102, 200 };
	int seatsInRide;

	void fillRide() {

		for (int counter = 0; counter < height.length; counter++) {
			if (90 < height[counter] && height[counter] < 200) {
				seatsInRide = seatsInRide + 1;
				if (seatsInRide <= 10) {
					System.out.println("Person number " + personInLine[counter] + " can sit in ride");
				}
			}
			
			if (seatsInRide == 10) {
				System.out.println("Seats are full, please wait for next ride");
			}
		}
	}

}
