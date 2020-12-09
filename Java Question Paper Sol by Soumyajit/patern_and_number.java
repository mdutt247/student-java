/*
WAP to print following patern.[] 
*1
**2
***3
****4
*****5
*/
public class patern_and_number
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print(j-1);
			System.out.println();
		}
	}
}
