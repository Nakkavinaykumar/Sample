package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable {
    private static final long serialVersionUID = 1L; // Serialization version UID
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    // Getters and setters (omitted for brevity)
    
}

public class SerializationDeserializatio {
    public static void main(String[] args) {
        // 
    	/*Serialization*/
        Student1 Student1 = new Student1("Alice", 20);
        String filename = "D:\\Student1.ser";

        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
System.out.println("ggggg");
            out.writeObject(Student1);
            System.out.println("Student1 object serialized and saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Student1 deserializedStudent1 = (Student1) in.readObject();
            System.out.println("Student1 object deserialized:");
            System.out.println("Name: " + deserializedStudent1.getName());
            System.out.println("Age: " + deserializedStudent1.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}