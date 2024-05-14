package firstDayJava;

public class MainClass {
	public static void main(String args[]) {
		System.out.println("The arithmetic operations on the two numbers is");

		ArithmaticOperations fon = new ArithmaticOperations(); // fon is Object

		int number1 = fon.a;
		int number2 = fon.b;
		System.out.println("a = " + number1);
		System.out.println("b = " + number2);
		fon.addNumbers();
		fon.subtractNumbers();
		fon.quotientOfTwoNumbers();
		fon.multiplyNumbers();
		fon.remainderOfTwoNumbers();

	}

}
