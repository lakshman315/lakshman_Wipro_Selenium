package day9;

import java.io.*;

class person1 implements Serializable 
{
	private static final long serialVersionUID = 1L;

	int id;
	String name;
	int age;

	public person1(int id, String name, int age) 
	{
     this.id = id;
     this.name = name;
     this.age = age;
	}
}

public class SerializePerson 
{
	public static void main(String[] args) 
	{
    
		person1 person = new person1(1, "Lakshman", 30);

		try (FileOutputStream fileOut = new FileOutputStream("person.ser");
          ObjectOutputStream out = new ObjectOutputStream(fileOut)) 
		{

			out.writeObject(person);
			System.out.println("Person object serialized to person.ser");

		} 
		catch (IOException e) 
		{
         e.printStackTrace();
		}
	}
}
