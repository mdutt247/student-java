import java.util.Scanner;
import java.io.*;
public class palindrome_string
{
	public static void main(String []args)
	{
		int i;
		String str;
		String rev="";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string value : ");
		str=in.nextLine();
		for(i=str.length()-1;i>=0;--i)	
		{
			rev +=str.charAt(i);
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(str))	
		{
			System.out.println("The string is Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}