package methodExample2;

import java.util.Scanner;

public class StudentInformationMain {

	public static void main(String[] args) {

		StudentInformation rahul = new StudentInformation();
		rahul.nameOfStudent = "Rahul Arora";
		rahul.dOBofStudent = 19930101;
		rahul.genderOfStudent = "Male";
		rahul.gradeScored = "A+";
		rahul.studentNumber = 12345;
		rahul.courseEnrolled = "Business";

		StudentInformation preeti = new StudentInformation();
		preeti.nameOfStudent = "Preeti Kaur";
		preeti.dOBofStudent = 19950501;
		preeti.genderOfStudent = "Female";
		preeti.gradeScored = "B+";
		preeti.studentNumber = 12357;
		preeti.courseEnrolled = "Arts";

		StudentInformation rohan = new StudentInformation();
		rohan.nameOfStudent = "Rohan Singh";
		rohan.dOBofStudent = 19891212;
		rohan.genderOfStudent = "Male";
		rohan.gradeScored = "B";
		rohan.studentNumber = 12237;
		rohan.courseEnrolled = "Engineering";

		StudentInformation rakul = new StudentInformation();
		rakul.nameOfStudent = "Rakul Arora";
		rakul.dOBofStudent = 19910306;
		rakul.genderOfStudent = "Female";
		rakul.gradeScored = "A";
		rakul.studentNumber = 12235;
		rakul.courseEnrolled = "Politics";

		StudentInformation[] studentsInfo = { rahul, preeti, rohan, rakul };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Date of Birth in YYYYMMDD : ");
		int studentDOBEntered = sc.nextInt();

		System.out.println("Enter your Student Number : ");
		int studentNumEntered = sc.nextInt();

//		boolean isStudentFound = false;
//
//		for (int i = 0; i < studentsInfo.length; i++) {
//
//			if (studentsInfo[i].dOBofStudent == studentDOBEntered) {
//
//				if (studentsInfo[i].studentNumber == studentNumEntered) {
//					System.out.println("Name of Student : " + studentsInfo[i].getNameOfStud());
//					System.out.println("Student is enrolled in " + studentsInfo[i].getCourseOfStudent());
//					System.out.println("Student has scored " + studentsInfo[i].gradeScored + (" grade"));
//					isStudentFound = true;
//					break;
//				}
//			}
//		}
//
//		if (!isStudentFound) {
//			System.out.println("We don't have information for this student");
//
//		}
//		
//		boolean isStudentFound = false;
//
//		for (int i = 0; i < studentsInfo.length; i++) {
//			
//			boolean isDOBvalid = studentsInfo[i].validatedOB(studentDOBEntered);
//			boolean isNumValid = studentsInfo[i].validateStudentNumber(studentNumEntered);
//
//			if (isDOBvalid && isNumValid) {
//
//					System.out.println("Name of Student : " + studentsInfo[i].getNameOfStud());
//					System.out.println("Student is enrolled in " + studentsInfo[i].getCourseOfStudent());
//					System.out.println("Student has scored " + studentsInfo[i].gradeScored + (" grade"));
//					isStudentFound = true;
//					break;
//				}
//			}
//
//		if (!isStudentFound) {
//			System.out.println("We don't have information for this student");
//
//		}

//		boolean isStudentFound = false;
//
//		for (int i = 0; i < studentsInfo.length; i++) {
//			
//			if (studentsInfo[i].validStudent(studentDOBEntered, studentNumEntered)) {
//
//					System.out.println("Name of Student : " + studentsInfo[i].getNameOfStud());
//					System.out.println("Student is enrolled in " + studentsInfo[i].getCourseOfStudent());
//					System.out.println("Student has scored " + studentsInfo[i].gradeScored + (" grade"));
//					isStudentFound = true;
//					break;
//				}
//			}
//
//		if (!isStudentFound) {
//			System.out.println("We don't have information for this student");
//
//		}

		StudentInformation student = new StudentInformation();

		student = student.getDetailsifValidCrednetials(studentDOBEntered, studentNumEntered, studentsInfo);

//		System.out.println("Name of Student : " + student.getNameOfStud());
//		System.out.println("Student is enrolled in " + student.getCourseOfStudent());
//		System.out.println("Student has scored " + student.gradeScored + (" grade"));

		student.displayStudentDetails();

	}
}
