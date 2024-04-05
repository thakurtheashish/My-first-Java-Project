package firstDayJava;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("The arithmetic operations on the three numbers is");

		FunctionOnNumber fon = new FunctionOnNumber(); // fon is Object

		int number1 = fon.a;
		int number2 = fon.b;
		int number3 = fon.C;
		System.out.println("A = " + number1);
		System.out.println("B = " + number2);
		System.out.println("C = " + number3);
		fon.addNumbers();
		fon.subtractNumbers();
		fon.quotientNumbers();
		fon.multiplyNumbers();
		fon.averageOfNumbers();

	}

}
