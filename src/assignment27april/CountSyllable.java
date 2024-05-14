package assignment27april;

public class CountSyllable {

	private String word;

	public void numOfSyllable(String word) {
		String[] wordArray = word.split("-");
		System.out.println("The number of syallable " + word + " has : " + wordArray.length);
	}

}
