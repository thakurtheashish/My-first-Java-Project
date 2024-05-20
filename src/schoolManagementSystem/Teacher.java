package schoolManagementSystem;

import java.util.ArrayList;

public class Teacher extends Person {

	private String employeeID;
	private double salary;
	private double averageRating;
	private ArrayList<String> coursesTaught;
	private ArrayList<Double> ratings;

	protected Teacher(String name, int age, String gender, String employeeID, double salary,
			ArrayList<String> coursesTaught, ArrayList<Double> ratings) {
		super(name, age, gender);
		this.employeeID = employeeID;
		this.salary = salary;
		this.coursesTaught = coursesTaught;
		this.ratings = new ArrayList<Double>();
	}

	public ArrayList<String> getCoursesTaught() {
		return coursesTaught;
	}
	
	@Override
	public void describeRole() {
		System.out.println(getName() + " is a teacher");
	}

	public void addRating(double rating) {
		if (rating >= 1 && rating <= 5) {
			ratings.add(rating);
		} else {
			System.out.println("Please provide a valid rating");
		}
	}

	public double calculateAverageRating() {
		double totalRating = 0;
		for (int i = 0; i < ratings.size(); i++) {
			totalRating = totalRating + ratings.get(i);
		}
		averageRating = totalRating / ratings.size();
		return averageRating;
	}

}
