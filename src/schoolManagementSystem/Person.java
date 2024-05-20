package schoolManagementSystem;

public abstract class Person {

	protected String name;
	protected int age;
	protected String gender;

	protected Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public abstract void describeRole();

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	
}
