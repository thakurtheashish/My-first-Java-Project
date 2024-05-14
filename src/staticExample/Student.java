package staticExample;

import java.util.Random;

public class Student {
	
	static String subject;
	 static String classTime;
	 final static String instructor = Constants.instructors;
	 private int rollNo;
	 
	 

	public int getRollno() {
		return rollNo;
	}

	public void setRollno(int rollNo) {
		this.rollNo = rollNo;
	}

	private String name;
	private int age;
	private String phoneNumber;
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}
	
//	public void setInstructor(String[] instructor) {
//		this.instructor = instructor;
//	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	protected Student(String name, int age, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	public static Long generateZoomLink() {
		Random random = new Random();
		Long zoomLinkNumber = random.nextLong();
		return zoomLinkNumber;
				
	}
	
	public static int generateRollNo(){
		//can't call a non static method in static method
		//submitAssignment();
		//String name = getName();
		// can call another static method inside a static method
		generateZoomLink();
		return new Random().nextInt(100);
	}
	
	public void submitAssignment() {
		// can call a static method inside a non static method
		int rollNumber = generateRollNo();
		System.out.println("Submit assingment on time");
	}
	

}


