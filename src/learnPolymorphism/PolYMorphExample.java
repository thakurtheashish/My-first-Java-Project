package learnPolymorphism;

public class PolYMorphExample {
	
	public void addNumbers (int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum of number is : " + sum);
	}
	
	public void addNumbers (int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("Sum of number is : " + sum);
	}
	
	public void addNumbers (double num1, double num2) {
		double sum = num1 + num2;
		System.out.println("Sum of number is : " + sum);
	}
	
	public void addNumbers (double num1, int num2) {
		double sum = num1 + num2;
		System.out.println("Sum of number is : " + sum);
	}
	
	public void addNumbers (int num1, double num2) {
		double sum = num1 + num2;
		System.out.println("Sum of number is : " + sum);
	}

}
