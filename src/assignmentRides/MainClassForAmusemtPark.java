package assignmentRides;
/*In Amusement park, a ride can carry max 10 people. Write a code 
 * to help the operator from overfilling the ride i.e  more than 
 * 10 people should not be allowed to get on the ride.  Also
 *  ensure that the people getting on the ride meets the height 
 *  criteria , Height of person 
 * should be greater than 90 cm but less than 200 cm.
 * */
import java.util.Scanner;

public class MainClassForAmusemtPark {

	public static void main(String[] args) {
		
		AmusementParkRide ride = new AmusementParkRide();

		Scanner sc = new Scanner(System.in);

		System.out.print("Number of seats already filled on ride = ");
		int seats = sc.nextInt();

		if (seats < 10) {
			ride.seatsInRide = seats;
			ride.heightCondition();
		} else {
			System.out.println("Seats are full, please wait for next ride");
		}
	}
}