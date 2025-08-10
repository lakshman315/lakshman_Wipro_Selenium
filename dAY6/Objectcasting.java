package dAY6;

class Animal 
{
	void makeSound() 
	{
		System.out.println("Animal sound");
	}
}

class Dog extends Animal
{
	void makeSound() 
	{
		System.out.println("Woof!");
	}

	void fetch() 
	{
		System.out.println("Fetching the ball!");
	}
}

public class Objectcasting 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		Animal a = d;      
		a.makeSound();  
		d.fetch();
     
	}
}
