/*
WAP to calculate length of a given string.Find number of vowels , repeted characters , uppercase characters & lower 
case character present in string.
*/ 
class length_vow_repchar_upcase_lowcase
{
	public static void main(String args[])
	{
		String str=args[0];
		char ch;
		int i,vowel=0,uper=0,lower=0;
		System.out.println("Length of string is : " + str.length());		
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
			{
				vowel++;
			}
		}
		System.out.println("Number of vowels is " + vowel);
	

	for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				uper++;
			}
		}
		System.out.println("Number of uppercase character is : " + uper);
		
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch>=97 && ch<=122)
			{
				lower++;
			}
		}
		System.out.println("Number of lowercase character is : " + lower);
	}
}