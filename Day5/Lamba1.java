package Day5;
interface Calculator {
    int sum(int a, int b);
}
public class Lamba1 {

	public static void main(String[] args) 
	{

		 Calculator add = (a, b) -> a + b;
		 int result = add.sum(5, 7);
		 System.out.println("Sum of two intergers is: " + result);

	}

}
