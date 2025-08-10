package Day5;
class Student {
   
    private String name;
    private int rollNumber;
    private int marks; 

   public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            this.marks = 0; 
        }
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }

   
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

   
    public void inputMarks(int newMarks) {
        
        if (newMarks >= 0 && newMarks <= 100 && newMarks > this.marks) {
            this.marks = newMarks;
            System.out.println("Marks updated successfully!");
        } else {
            System.out.println("Marks update failed! Conditions not met.");
        }
    }
}
public class Studentgrade {

	public static void main(String[] args) 
	{
		
		Student s1 = new Student("lakshman", 101, 70);
        s1.displayDetails();

        System.out.println("\nAfter update marks...");
        s1.inputMarks(90); 
        s1.displayDetails();

        System.out.println("\nAfter reduce marks...");
        s1.inputMarks(80);
        s1.displayDetails();

	}

}
