package package_assessment;

public class M {

	public static void main(String[] args) {
		// sum of digits of number(6785=6+7+8+5)
		int n=6785;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.print(sum);

	}

}
