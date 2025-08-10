package day9;

import java.util.*;

class Person 
{
	private String name;
	private int age;

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName() 
	{ 
		return name; 
	}
	public int getAge() 
	{ 
		return age;
	}

	public String toString() 
	{
		return name + " (" + age + ")";
	}
}

public class TreeSetCustomComparatorExample 
{
	public static void main(String[] args) 
	{
    
		Comparator<Person> ageComparator = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());

		Set<Person> persons = new TreeSet<>(ageComparator);
   
		persons.add(new Person("Lakshman", 25));
		persons.add(new Person("Prudhvi", 30));
		persons.add(new Person("Suvin", 20));
		persons.add(new Person("David", 30)); 

		for (Person p : persons)
		{
			System.out.println(p);
		}
	}
}
