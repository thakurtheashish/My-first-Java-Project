package firstDayJava;

public class ArithmaticOperations {

	int a = 50;
	int b = 100;
	double result;

	void addNumbers() {
		result = a + b;
		System.out.println("a + b = " + result);
	}

	void subtractNumbers() {
		result = a - b;
		System.out.println("a - b = " + result);
	}

	void multiplyNumbers() {
		result = a * b;
		System.out.println("a * b = " + result);
	}

	void quotientOfTwoNumbers() {
		result = a / b;
		System.out.println("a / b =" + result);

	}

	void remainderOfTwoNumbers() {
		result = a % b;
		System.out.println("a % b = " + result);
	}

}
