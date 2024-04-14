package incrememtOperator;

public class IncrementExample {
	int[] x = { 124, 125, 148, 149, 158, 168, 133, 11, 12, 1256, 456, 259 };
	int a;

	void findEvenNumber() {
		for (int counter = 0; counter < 12; counter++) {
			a = x[counter] % 2;
			if (a == 0) {

				System.out.println(x[counter]);
			}

		}
	}
	
	void findOddNumber() {
		for (int counter = 0; counter < 12; counter++) {
			a = x[counter] % 2;
			if (a != 0) {

				System.out.println(x[counter]);
			}

		}
	}
}
