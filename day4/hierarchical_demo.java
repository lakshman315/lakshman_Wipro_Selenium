package day4;

class After12th 
{
	void display() 
	{
     System.out.println("Courses available after 12th:");
	}
}

class Engineering extends After12th
{
	void displayEngineering() 
	{
		System.out.println("Engineering Courses:");
		System.out.println("1. IT");
		System.out.println("2. Mechanical");
		System.out.println("3. Computer Science (CS)");
	}
}

class Medical extends After12th 
{
	void displayMedical() 
	{
		System.out.println("Medical Courses:");
		System.out.println("1. MBBS");
		System.out.println("2. BDS");
	}
}

class OtherCourses extends After12th 
{
	void displayOtherCourses()
	{
		System.out.println("Other Courses:");
		System.out.println("1. BCA");
		System.out.println("2. BBA");
	}
}

public class hierarchical_demo 
{
	public static void main(String[] args) 
	{
		After12th courses = new After12th();
		courses.display();
     
		Engineering eng = new Engineering();
		eng.displayEngineering();
     
		Medical med = new Medical();
		med.displayMedical();
     
		OtherCourses other = new OtherCourses();
		other.displayOtherCourses();
	}
}

