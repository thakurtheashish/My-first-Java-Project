package assignment27april;

public class ExtractCity {
	
	String input;

	public String grabCity(String input) {

		String cityName = input.substring(input.lastIndexOf("[") + 1, input.lastIndexOf("]"));
        return cityName;
	}

}
