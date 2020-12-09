import java.util.*;
public  class StringCalcAlpha
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s = in.nextLine();
		System.out.println("Enter a character:");
		char c=in.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
			count++;
			}
		}
		System.out.println(count);
	}
}
