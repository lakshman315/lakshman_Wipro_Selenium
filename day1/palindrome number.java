package package_assessment;

public class L {

	public static void main(String[] args) 
	{
		// check palindrome number.
		int n=434;
		int t=n;
		int rev=0;
		while(t>0)
		{
			int r=t%10;
			rev=rev*10+r;
			t=t/10;
		}
		if(n==rev)
		{
			System.out.print("palindrome");
		}
		else
		{
			System.out.print("Not a palindrome");
		}

	}

}
