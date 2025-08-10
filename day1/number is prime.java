package package_assessment;

public class G {

	public static void main(String[] args) {
		// check if a number is prime.
		int n=3;
		int fc=0;
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				fc++;
			}
		}
		if(fc==0)
		{
			System.out.print(n+" is a prime");
		}
		else
		{
			System.out.print(n+" is not a prime");
		}
	}

}
