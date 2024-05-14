package staticExample;

import java.util.Arrays;

import enumExample.Subjects;

public class StaticMain {
	public static void main(String[] args) {

		Student student1 = new Student("Annena", 16, "98765432");
		
		student1.setRollno(Student.generateRollNo());
		Student student2 = new Student("Arshpreet", 17, "8784652");
		student2.setRollno(Student.generateRollNo());
		Student student3 = new Student("Ravneet", 18, "9875512");
		student3.setRollno(Student.generateRollNo());

		student1.setClassTime("7:30 pm till 9:30 pm");
		student2.setClassTime("7:30 pm till 9:30 pm");
		student3.setClassTime("7:30 pm till 9:30 pm");

		// Static means common to all the objects.
		// Alternatively, Static variables belong to class

		Student.subject = "Java";
		Student.subject = Subjects.Maven.name(); 
//or
		Student.subject = Subjects.Maven.toString();
		System.out.println(Subjects.ManualTesting);
		System.out.println(Arrays.toString(Subjects.values()));
		Student.classTime = "7:30 pm till 9:30 pm";
		// Student.instructor = {"Ketaki", "Manvir", "Swaroop"};

		System.out.println("Student 1 details : Name " + student1.getName() + " age : " + student1.getAge()
				+ " Subject : " + Student.subject + " Class timing : " + Student.classTime
				+ " Student ROll No. : " + student1.getRollno());

		System.out.println("Student 2 details : Name " + student2.getName() + " age : " + student2.getAge()
				+ " Subject : " + Student.subject + " Class timing : " + Student.classTime
				+ " Student ROll No. : " + student2.getRollno());

		System.out.println("Student 3 details : Name " + student3.getName() + " age : " + student3.getAge()
				+ " Subject : " + Student.subject + " Class timing : " + Student.classTime
				+ " Student ROll No. : " + student3.getRollno());

		System.out.println();
		System.out.println("After subject change");

//	 student1.setSubject("Selenium");
//	 student2.setSubject("Selenium");
//	 student3.setSubject("Selenium");
//	 or
		Student.subject = "Selenium";
		System.out.println("Student 1 details : Name " + student1.getName() + " age : " + student1.getAge()
				+ " Subject : " + Student.subject + " Class timing : " + Student.classTime);

		System.out.println("Student 2 details : Name " + student2.getName() + " age : " + student2.getAge()
				+ " Subject : " + Student.subject + " Class timing : " + Student.classTime);

		System.out.println("Student 3 details : Name " + student3.getName() + " age : " + student3.getAge()
				+ " Subject : " + Student.subject + " Class timing : " + Student.classTime);

		Student.subject = "Maven";
		System.out.println();
		System.out.println("After subject change");

		System.out.println("Student 1 details : Name " + student1.getName() + " age : " + student1.getAge()
				+ " Subject : " + Student.subject + " Class timing : " + Student.classTime);

		System.out.println("Student 2 details : Name " + student2.getName() + " age : " + student2.getAge()
				+ " Subject : " + Student.subject + " Class timing : " + Student.classTime);

		System.out.println("Student 3 details : Name " + student3.getName() + " age : " + student3.getAge()
				+ " Subject : " + Student.subject + " Class timing : " + Student.classTime);

		// Student.instructor = "Manvir"; no changes to final static
		System.out.println("Instructor of class is : " +Student.instructor);

		System.out.println("Generate Zoom Link : " + Student.generateZoomLink());
		System.out.println("Generate Zoom Link : " + Student.generateZoomLink());
		System.out.println("Add two numbers "+ Math.addExact(12, 120)) ;
	}

}
