package day10;

import java.io.*;

class Student implements Serializable 
{
	private static final long serialVersionUID = 1L;
 
	private String name;
	private int age;
	private String grade;
 
	public Student(String name, int age, String grade)
	{
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public String toString() 
	{
		return "Student{name='" + name + "', age=" + age + ", grade='" + grade + "'}";
	}
}

public class StudentSerializationDemo 
{

	public static void serializeStudent(Student student, String filename) 
	{
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) 
		{
			oos.writeObject(student);
			System.out.println("Student object serialized to " + filename);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	public static Student deserializeStudent(String filename) 
	{
		Student student = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
		{
			student = (Student) ois.readObject();
			System.out.println("Student object deserialized from " + filename);
		} 
		catch (IOException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		return student;
	}

	public static void main(String[] args)
	{
		Student student = new Student("Lakshman", 20, "A");
		String filename = "student.ser";

		serializeStudent(student, filename);

		Student deserializedStudent = deserializeStudent(filename);
     	System.out.println("Deserialized Student: " + deserializedStudent);
	}
}
