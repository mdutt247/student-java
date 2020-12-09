/*
WAP to print following patern.
ABCDE
 BCDE
  CDE
   DE
    E
*/
class patern_rev_alpha
{
	public static void main(String args[])
	{
		
		int i,j;
		for(i=1;i<=5;i++)
		{
			
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			
			}
			for(j=i;j<=5;j++){
				System.out.print((char)('A'-1+j));
			}
			System.out.println();
		}
	}
}