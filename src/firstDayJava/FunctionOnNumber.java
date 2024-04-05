package firstDayJava;

public class FunctionOnNumber {

	int a = 127;
	int b = 10;
	int C = 5;
	double D;

	void addNumbers() {
		D = a + b + C;
		System.out.println("A + B + C = " + D);
	}

	void subtractNumbers() {
		D = a - b - C;
		System.out.println("A - B - C = " + D);
	}

	void multiplyNumbers() {
		D = a * b * C;
		System.out.println("A * B * C = " + D);
	}

	void quotientNumbers() {
		D = a%b;
		System.out.println("A%B =" + D);

	}

	void averageOfNumbers() {
		D = (a * b * C) / 3;
		System.out.println("Average of 3 Numbers is = " + D);
	}

}
