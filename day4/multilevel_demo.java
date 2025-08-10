package day4;

class Vehicle 
{
	String type = "Vehicle";
	public void displayType() 
	{
     System.out.println("Type: " + type);
	}
}
class Four_wheeler extends Vehicle
{
	String numberOfWheels = "Four_wheeler";
	public void displayWheels() 
	{
		System.out.println("Number of wheels: " + numberOfWheels);
	}
}

class Petrol_Four_Wheeler extends Four_wheeler 
{
	String fuelType = "Petrol";
	public void displayFuelType()
	{
		System.out.println("Fuel type: " + fuelType);
	}
}


class FiveSeater_Petrol_Four_Wheeler extends Petrol_Four_Wheeler 
{
	String seatingCapacity = "Five-seater";
	public void displaySeatingCapacity() 
	{
		System.out.println("Seating capacity: " + seatingCapacity);
	}
}

class Baleno_FiveSeater_Petrol_Four_Wheeler extends FiveSeater_Petrol_Four_Wheeler 
{
	String modelName = "Baleno";

	public void displayModelName() 
	{
		System.out.println("Model name: " + modelName);
	}
}

public class multilevel_demo 
{
	public static void main(String[] args) 
	{
		Baleno_FiveSeater_Petrol_Four_Wheeler myCar = new Baleno_FiveSeater_Petrol_Four_Wheeler();
		System.out.println("Characteristics of my car:");
		myCar.displayType();             
		myCar.displayWheels();           
		myCar.displayFuelType();         
		myCar.displaySeatingCapacity();  
		myCar.displayModelName();        
	}
}