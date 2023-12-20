package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

	class Student {
	    private String name;
	    private int age;

	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public int getAge() {
	        return age;
	    }

	    @Override
	    public String toString() {
	        return "Student{name='" + name + "', age=" + age + '}';
	    }
	}

	public class ComparatorExample {
	    public static void main(String[] args) {
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("Alice", 22));
	        students.add(new Student("Bob", 20));
	        students.add(new Student("Charlie", 25));

	        // Using a custom comparator to sort students by age in descending order
	        Collections.sort(students, Comparator.comparingInt(Student::getAge).reversed());

	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }
	}



