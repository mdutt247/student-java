import java.util.Scanner;
class count_vowel
{
	public static void main(String []args)
	{
		char ch;
		int vowel=0,i;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a String");
		String str = in.nextLine();
		System.out.println("Count = " + str.length());
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
			{
				vowel++;
			}
		}
		System.out.println("Number of vowels is " + vowel);
	}
}