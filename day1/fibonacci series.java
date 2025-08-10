package package_assessment;

public class J {

	public static void main(String[] args) {
		// Print Fibonacci series up to 10 terms 1 2 3 5...
		int n=10;
		int a=1,b=2;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}

	}

}
