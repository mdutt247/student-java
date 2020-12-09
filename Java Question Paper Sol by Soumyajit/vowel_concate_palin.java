import java.util.*;
class vowel_concate_palin
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		String str=args[0];
		int count=0;
		char c;
		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			{
				count++;
			}
		}
		System.out.println("Number of vowel is : "+count);
		System.out.println("Enter an another string : ");
		String str1=in.nextLine();
		System.out.println("Concation of " + str + " & " +str1+" is : " + (str+" "+str1));
		String s=(str+str1);
		String rev="";
		for(int j=s.length()-1;j>=0;--j)
		{
			rev+=s.charAt(j);
		}
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("The string is palindrome");
		}
		else
		{
			System.out.println("The string is not palindrome");
		}
	}
}