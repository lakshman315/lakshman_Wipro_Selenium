package dAY6;


class OddNumberException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OddNumberException(String message) 
	{
		super(message);
	}
}

public class OddChecker 
{
	public static void checkOdd(int n) throws OddNumberException
	{
		if (n % 2 != 0) 
		{
			throw new OddNumberException("Odd number: " + n);
		}
 }

 public static void main(String[] args) 
 {
     int numbers[] = {2, 5, 8, 11, 14};

     for (int n : numbers) 
     {
         try 
         {
             checkOdd(n);
             System.out.println(n + " is even.");
         } 
         catch (OddNumberException e)
         {
             System.out.println(e.getMessage());
         }
     }
 }
}
