package entites;

import java.util.Set;
import java.util.TreeSet;

public class Teacher {
	
	private String name;
	
	private Set<Student> setStudents = new TreeSet<>();
	
	public Teacher(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addStudent(Student student) {
		setStudents.add(student);
	}
	
	public void removeStudent(Student student) {
		setStudents.remove(student);
	}
	
	public int sizeStudent() {
		return setStudents.size();
	}
	
	
	
	
}
