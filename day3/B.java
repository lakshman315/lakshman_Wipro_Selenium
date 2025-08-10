package package_Strings;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Lakshman";
		str=str.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.print(count);

	}

}
