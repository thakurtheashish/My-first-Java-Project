package schoolManagementSystem;

public class Student extends Person {

	private String studentID;
	private double percentage;

	protected Student(String name, int age, String gender, String studentID, double percentage) {
		super(name, age, gender);
		this.studentID = studentID;
		this.percentage = percentage;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[Name : " + name + ", Age : " + age + ", Gender : " + gender + " Percentage : " + percentage + "%]";
	}

	@Override
	public void describeRole() {
		System.out.println(getName() + " is a student.");
	}

	public void determineStream(double percentage) {

		if (percentage > 100) {
			System.out.println("Please enter the correct percentage");
		} else if (percentage >= 85) {
			System.out.println(" Allocated Stream : Non Medical");
			System.out.println(this.name + " can enroll in courses like Physics & Mathematics");
		} else if (percentage >= 75) {
			System.out.println(" Allocated Stream : Medical");
			System.out.println(this.name + " can enroll in courses like Biology & Chemistry");
		} else if (percentage >= 65) {
			System.out.println(" Allocated Stream : Commerce");
			System.out.println(this.name + " can enroll in courses like Economics & Business Studies");
		} else {
			System.out.println("Allocated Stream : Arts");
			System.out.println(this.name + " can enroll in courses like History & Literature");
		}
	}

	public void rateTeacher(Teacher teacher, double rating) {
		teacher.addRating(rating);

	}
}
