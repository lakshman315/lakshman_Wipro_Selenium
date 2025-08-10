package Day5;
import java.util.function.Predicate;
public class lambda2 
{
	public static void main(String[] args)
	{
		
        Predicate<String> isEmpty = s -> s.isEmpty();
        
     
        System.out.println(isEmpty.test(""));       
        System.out.println(isEmpty.test("Hello"));  

	}

}


