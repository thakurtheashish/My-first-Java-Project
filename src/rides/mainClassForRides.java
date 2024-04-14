package rides;

import java.util.Scanner;

public class mainClassForRides {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your height in cm = ");
		int h = sc.nextInt();
		
		System.out.print("Enter your weight in kg = ");
		int w = sc.nextInt();
		
		Scanner ride = new Scanner(System.in);
		System.out.print("Enter the ride you wish to enjoy = ");
		String rideSelected = ride.nextLine();
		
		levianthRide l = new levianthRide();
		yukonStrikerRide y = new yukonStrikerRide();
		behemothRide b = new behemothRide();
		
		l.height = h;
		b.height = h;
		y.height = h;
		l.weight = w;
		b.weight = w;
		y.weight = w;
		
		
		if (rideSelected.equals("Behemoth")) {
			b.behemoth();
		} else if (rideSelected.equals("Levianth")) {
			l.levianth();
		}else if (rideSelected.equals("Yukon")){
			y.yukonStriker();
		}else {
			System.out.println("Invalid Entry");
		}
	}

}
