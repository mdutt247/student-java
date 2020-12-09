/*
WAP to print following patern
A
BB
CCC
DDDD
EEEEE
*/
class patern_alpha
{
	public static void main(String args[])
	{
		char ch='A';
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}
}