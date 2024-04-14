package rides;

public class yukonStrikerRide {

	int height, weight;

	void yukonStriker() {
		if (height >= 120 && weight >= 55) {
			System.out.println("You can enjoy Yukon Striker");
		} else {
			System.out.println("Sorry, You don't meet minimum criteria for Yukon Striker ride");
		}
	}
}
