package com.test;

import java.io.*;

class Person implements Serializable {
    private String name;
    private transient String temporaryData;

    public Person(String name, String temporaryData) {
        this.name = name;
        this.temporaryData = temporaryData;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemporaryData() {
		return temporaryData;
	}

	public void setTemporaryData(String temporaryData) {
		this.temporaryData = temporaryData;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", temporaryData=" + temporaryData + "]";
	}

    // Getters and setters (omitted for brevity)
    
}

public class TransientExample {
    public static void main(String[] args) {
        // Serialization
        Person person = new Person("Alice", "Hello Alice");
        String filename = "D:\\person.ser";

        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(person);
            System.out.println("Person object serialized and saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Person object deserialized:");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Temporary Data: " + deserializedPerson.getTemporaryData()); // This will be null
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

