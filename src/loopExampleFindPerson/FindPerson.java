package loopExampleFindPerson;

public class FindPerson {

	String[] listOfStudents = { "Prabh", "Arsh", "Jerin", "Gian", "Manvir" };
	int[] age = { 12, 13, 14, 56, 54 };

	public void findArsh() {
		
		for (int counter = 0; counter < listOfStudents.length; counter++) {
			if (listOfStudents[counter] == "Arsh") {
				System.out.println("Name of Student in first search is = " + listOfStudents[counter]);
				break;
			} else if (counter >= listOfStudents.length - 1) {
				System.out.println("Student is not in list");
			}
		}
	}
	
	void findStudent() {
		boolean isStudentPresent = false;
		
		for (int counter = 0; counter < listOfStudents.length; counter++) {
			if (listOfStudents[counter] == "Ash") {
				System.out.println("Name of Student is = " + listOfStudents[counter]);
				isStudentPresent = true;
				break;
			}
		}
		
		if(!isStudentPresent) {
			System.out.println("Student in not present in 2nd search");
		}
	}
	
}
