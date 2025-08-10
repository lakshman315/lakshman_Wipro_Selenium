package Day5;
interface MaxMinCalculator {
    int calculate(int a, int b);
}

public class MaxMinLambdaExample {

	public static void main(String[] args) 
	{
		
		MaxMinCalculator max = (a, b) -> (a > b) ? a : b;
		
       
        MaxMinCalculator min = (a, b) -> (a < b) ? a : b;


        System.out.println("Max: " + max.calculate(10, 20));
        System.out.println("Min: " + min.calculate(30, 20));

	}

}


