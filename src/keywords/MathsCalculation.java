package keywords;

public class MathsCalculation {
	final double pi = 3.14;
	double g = 9.8;
	
	// final method can't be overridden
	final public void finalMethod() {
		System.out.println("Inside final method");
		String s = "Keyword";
		System.out.println(s.substring(0,3));
	}

	public void finalMethod(String a) {
		System.out.println("Overloaded final method"); 
		
}
}
