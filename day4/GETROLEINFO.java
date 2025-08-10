package day4;

abstract class Person
{
	protected String name;
	protected int age;
	public Person(String name, int age)
	{
     this.name = name;
     this.age = age;
	}
	public abstract String getRoleInfo();
}

class Student extends Person 
{
	private String course;
	private String rollNumber;

	public Student(String name, int age, String course, String rollNumber)
	{
		super(name, age);
		this.course = course;
		this.rollNumber = rollNumber;
	}
	public String getRoleInfo() 
	{
		return "Student Name: " + name + ", Age: " + age + ", Course: " + course + ", Roll Number: " + rollNumber;
	}
}
class Professor extends Person 
{
	private String subject;
	private double salary;
	public Professor(String name, int age, String subject, double salary) 
	{
		super(name, age);
		this.subject = subject;
		this.salary = salary;
	}
	
	public String getRoleInfo() 
	{
		return "Professor Name: " + name + ", Age: " + age + ", Subject: " + subject + ", Salary: $" + salary;
	}
}

class TeachingAssistant extends Student
{
	public TeachingAssistant(String name, int age, String course, String rollNumber) 
	{
		super(name, age, course, rollNumber);
	}
	public String getRoleInfo() 
	{
		return super.getRoleInfo() + " (Teaching Assistant)";
	}
}

public class GETROLEINFO 
{
	public static void main(String[] args) 
	{
		Person student = new Student("Lakshman", 23, "Computer Science", "204O7");
		Person professor = new Professor("Suvin", 45, "Mathematics", 75000);
		Person ta = new TeachingAssistant("Prudhvi", 24, "Computer Science", "204M7");

		System.out.println(student.getRoleInfo());
		System.out.println(professor.getRoleInfo());
		System.out.println(ta.getRoleInfo());
	}
}
