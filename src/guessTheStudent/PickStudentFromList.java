package guessTheStudent;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PickStudentFromList {

	ArrayList<String> students = new ArrayList<String>();

	public void loadStudentList() {
		try {
			Scanner sc = new Scanner(Paths.get("C:\\Users\\DELL\\Desktop\\QA Automation\\New Folder\\Names.txt"));

			while (sc.hasNextLine()) {
				String name = sc.nextLine();
				students.add(name);
			}
		} catch (Exception e) {
			System.out.println("Check the file path");
		}
	}

	public String pickRandomStudent() {
		Random randomStudent = new Random();
		int randomIndex = randomStudent.nextInt(students.size());
		return students.get(randomIndex);

	}
}
