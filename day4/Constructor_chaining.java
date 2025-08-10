package day4;

class Vehicle1
{
	Vehicle1() 
	{
		System.out.println("Vehicle Created");
	}
	void run() 
	{
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle1 
{
	Bike() 
	{
		super();  
		System.out.println("Bike Created");
	}
	void run() 
	{
		System.out.println("Bike is running safely");
	}
}

public class Constructor_chaining
{
	public static void main(String[] args) 
	{
		Vehicle1 v = new Bike();  
		v.run();  
	}
}
