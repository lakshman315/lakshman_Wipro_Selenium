package Day5;
interface FactorialCalculator
{
    int factorial(int n);
}

public class lamba_factorial {

	public static void main(String[] args) 
	{
		 FactorialCalculator f = n -> {
	            int fact = 1;
	            for (int i = 1; i <= n; i++) {
	                fact=fact*i;
	            }
	            return fact;
	        };

	        int number = 5;
	        System.out.println("Factorial of " + number + " is: " + f.factorial(number));

		
		       
	}

}
