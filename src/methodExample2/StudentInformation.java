package methodExample2;

public class StudentInformation {
	String nameOfStudent;
	String genderOfStudent;
	int studentNumber;
	String courseEnrolled;
	String gradeScored;
	int dOBofStudent;
	
	public String getNameOfStud() {
		return nameOfStudent;
	}

	public String getGenderOfStud() {
		return genderOfStudent;
	}
	
	public int studentNumber() {
		return studentNumber;
	}
	
	public String getGradeOfStud() {
		return gradeScored;
	}
	
	public String getCourseOfStudent() {
		return courseEnrolled;
	}
	
	public int getAgeOfStudent() {
		return dOBofStudent;
	}
	
	public boolean validatedOB(int studentDOBEntered) {
		if (dOBofStudent == studentDOBEntered) {
			return true;
		}
		return false;
	}
	
	public boolean validateStudentNumber(int studentNumEntered) {
		if (studentNumber == studentNumEntered) {
			return true;
		}
		return false;
	}
	
	public boolean validStudent (int studentDOBEntered, int studentNumEntered) {
		if (dOBofStudent == studentDOBEntered) {
			if (studentNumber == studentNumEntered) {
				return true;
			}
		} return false;
	}
	
	public StudentInformation getDetailsifValidCrednetials (int studentDOBEntered, int studentNumEntered, StudentInformation[] studentsInfo) {
		 
		for (int i =0; i< studentsInfo.length; i++)
			if (studentsInfo[i].getAgeOfStudent() == studentDOBEntered) {
				if (studentsInfo[i].studentNumber() == studentNumEntered) {
					return studentsInfo[i];
				}
					
			} return null;
	}
	
	public void displayStudentDetails() {
		
		System.out.println("Name of Student : " + getNameOfStud());
		System.out.println("Student is enrolled in " + getCourseOfStudent());
		System.out.println("Student has scored " + gradeScored + (" grade"));
	}
	
	
	

}
