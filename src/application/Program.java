package application;

import java.util.Scanner;

import entites.Student;
import entites.Teacher;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Teacher teacher = new Teacher("Alex");
		
		System.out.print("How many students for course A?");
		int courseA = sc.nextInt();
		for (int i=0; i < courseA; i++) {
			int code = sc.nextInt();
			Student student = new Student(code);
			teacher.addStudent(student);
		}
		
		System.out.print("How many students for course B?");
		int courseB = sc.nextInt();
		for (int i=0; i < courseB; i++) {
			int code = sc.nextInt();
			Student student = new Student(code);
			teacher.addStudent(student);
		}
		
		System.out.print("How many students for course C?");
		int courseC = sc.nextInt();
		for (int i=0; i < courseC; i++) {
			int code = sc.nextInt();
			Student student = new Student(code);
			teacher.addStudent(student);
		}
		
		System.out.println("Total of students that the " + teacher.getName() + " has is/are: " + teacher.sizeStudent());
		
			
		
		sc.close();
	}

}
