package com.fc.finaltest;

public class TeacherTest {
	public static void main(String[] args) {
		Person person = new Teacher();
		person.learn();
	}

}
final class Person{
	
	 final String getName(String name) {
	        return  name ;
	    }
	 
	final void learn() {
		System.out.println("Person is learning...");
	}
	
	final void play() {
		System.out.println("Person is playing..");
	}
	final void teach() {
		System.out.println("Person is teachig..");
	}
	final void discipline() {
		System.out.println("Person may be have  dicipline..");
	}

	 
	 
 }
 
 class Teacher extends Person{
	 
	 void teacherteach() {
		 System.out.println("teacher is learning to teach the students...");
	 }
	 
	void teacheSalary() {
			System.out.println("teacher get 80K Salary..");
		}
	
	void strictdiscipline() {
		System.out.println("Techaer having strict disipline..having.");
	}
	 
	 
 }
 
