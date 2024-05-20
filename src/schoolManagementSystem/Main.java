package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student student = null;

		School school = new School("Springfield High School");

		System.out.println("Welcome to " + school.getName() + " Stream Allocation and Teacher Rating System!");

		ArrayList<String> courses1 = new ArrayList<String>();
		courses1.add("Physics");
		courses1.add("Mathematics");
		Teacher teacher1 = new Teacher("Alice Johnson", 39, "Female", "Alice123", 50000.00, courses1, null);
		school.addTeacher(teacher1);

		ArrayList<String> courses2 = new ArrayList<String>();
		courses2.add("Chemistry");
		courses2.add("Biology");
		Teacher teacher2 = new Teacher("Rob Tyson", 49, "Male", "Rob123", 50000.00, courses2, null);
		school.addTeacher(teacher2);

		int response;
		
		do {
			System.out.println();
			System.out.println("Please select your option");
			System.out.println("1. Determine stream              2. Teacher Rating"
					+ "        3. Exit");
			response = sc.nextInt();
			System.out.println();
			switch (response) {
			case 1:
				System.out.print("Please enter the student's name: ");
				String name = sc.nextLine();
				sc.nextLine();
				System.out.print("Please enter the student's age: ");
				int age = sc.nextInt();
				
				System.out.print("Please enter the student's ID: ");
				String id = sc.next();
				System.out.print("Please enter the student's gender: ");
				String gender = sc.next();
				System.out.print("Please enter the student's academic percentage: ");
				double percentage = sc.nextDouble();

				student = new Student(name, age, gender, id, percentage);

				System.out.println();
				System.out.println("-- Stream Allocation Result --");
				System.out.println();

				System.out.println(student.toString());
				student.determineStream(percentage);
				break;
				
			case 2:
				
				System.out.println("Please enter the teacher's name you wish to rate: ");
				String nameEntered = sc.next();
				Teacher teacher = school.findTeacherByName(nameEntered);
				if (teacher != null) {
					
					System.out.print("Please enter your rating for (1-5): ");
					double rating = sc.nextDouble();
					System.out.println();
					student.rateTeacher(teacher, rating);
					double averageRating = teacher.calculateAverageRating();
					System.out.println("-- Updated Teacher Rating --");
					System.out.println("Teacher name : " + teacher.name);
					System.out.println("Courses taught: " + teacher.getCoursesTaught().toString());
					System.out.println("New Average Rating : " + averageRating);

				} else {
					System.out.println("This teacher is not present in this school");
				}
				break;
				
			case 3:
				System.out.println("Have a good day");

			default:
				System.out.println("Invalid option, please try again");
				break;
			}
		} while (response != 3);
	}
}
