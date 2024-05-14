package randomCItySelection;

import java.util.Random;

public class SelectRandomCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] cities = {"Toronto", "Edmonton", "Vancouver", "Winnipeg", "Regina", 
				 "Brampton", "Markham", "Calgary", "Richmond"};

	        Random random = new Random();

	        // Generate a random index within the bounds of the array
	        int randomIndex = random.nextInt(cities.length);

	        // Retrieve the random city from the array using the random index
	        String randomCity = cities[randomIndex];

	        // Print the random city
	        System.out.println("Random city from the array: " + randomCity);
	}

}
