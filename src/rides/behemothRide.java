package rides;

public class behemothRide {

	int height, weight;

	void behemoth() {
		if (height >= 129 && weight >= 60) {
			System.out.println("You can enjoy Behemoth");
		} else {
			System.out.println("Sorry, You don't meet minimum criteria for Behemoth ride");
		}
	}
}
