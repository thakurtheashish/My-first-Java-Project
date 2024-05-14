package assignment27april;

/*Q2) Write a function to return the city from each of these vacation spots.
As shown in example below index of search word ‘Pineapple’ is 0
Examples 
grabCity("[Last Day!] Beer Festival [Munich]") ➞ "Munich"
grabCity("Cheese Factory Tour [Portland]") ➞ "Portland"
grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]") ➞ "Kyoto"
*/

public class ExtractCityMain {

	public static void main(String[] args) {
		
		ExtractCity city = new ExtractCity();

	     System.out.println(city.grabCity("[Last Day!] Beer Festival [Munich]"));
	     System.out.println(city.grabCity("Cheese Factory Tour [Portland]"));
	     System.out.println(city.grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]"));
	    }
	}
