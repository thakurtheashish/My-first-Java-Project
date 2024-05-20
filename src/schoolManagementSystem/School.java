package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String name;
	private List<Teacher> teachers;
	private List<Student> students;

	public School(String name) {
		super();
		this.name = name;
		this.teachers = new ArrayList<Teacher>();
		this.students = new ArrayList<Student>();
	}

	public String getName() {
		return name;
	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public Teacher findTeacherByName(String name) {
		for (Teacher teacher : teachers) {
			if (teacher.getName().equals(name)) {
				return teacher;
			}
		}
		return null;
	}
}
