package day4;

class Hospital
{
	String hospitalName;
	String location;
 
 	public Hospital(String hospitalName, String location) 
 	{
 		this.hospitalName = hospitalName;
 		this.location = location;
 	}
 
	public void displayHospitalInfo() 
 	{
 		System.out.println("Hospital Name: " + hospitalName);
 		System.out.println("Location: " + location);
 	}
}

class Patient extends Hospital 
{
	String patientName;
	int patientAge;
 
 	public Patient(String hospitalName, String location, String patientName, int patientAge) 
 	{
 		super(hospitalName, location);  
 		this.patientName = patientName;
 		this.patientAge = patientAge;
 	}
 
 	public void displayPatientInfo() 
 	{
 		displayHospitalInfo();  
 		System.out.println("Patient Name: " + patientName);
 		System.out.println("Patient Age: " + patientAge);
 	}
}

public class hospital_demo 
{
	public static void main(String[] args) 
	{
		Patient p = new Patient("Narayana Hospital", "Rayavaram", "Lachayya", 70);
		p.displayPatientInfo();
	}
}
