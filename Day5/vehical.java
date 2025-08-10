package Day5;

interface BaseVehicle
{
	void start();
}


interface AdvancedVehicle extends BaseVehicle 
{
	void stop();
	boolean refuel(int amount);
}


class Car implements AdvancedVehicle
{
	private int fuelLevel;

 
	public Car(int initialFuel) 
	{
		this.fuelLevel = initialFuel;
	}


	public void start() 
	{
		if (fuelLevel > 0) 
		{
			System.out.println("Car is starting.");
		} 
		else 
		{
			System.out.println("Cannot start the car. Fuel level is empty.");
		}
	}

	public void stop() 
	{
		System.out.println("Car is stopping.");
	}


	public boolean refuel(int amount) 
	{
		if (amount > 0) 
		{
			fuelLevel += amount;
			System.out.println("Car refueled. Current fuel level: " + fuelLevel);
			return true;
		} 
		else 
		{
			System.out.println("Invalid refuel amount.");
			return false;
		}
	}
}


public class vehical {
 public static void main(String[] args) {
   
     AdvancedVehicle myCar = new Car(30);

     myCar.start();
     myCar.stop();
     myCar.refuel(20);

     BaseVehicle baseVehicle = myCar;
     baseVehicle.start();
 }
}
