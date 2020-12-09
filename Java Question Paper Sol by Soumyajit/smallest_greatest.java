//wajp to accept 20 number from user by cmd line args and print the smallest and largest number between them.
import java.util.*; 
class smallest_greatest
{
	public static void main(String []args)
	{
		try
		{
			int i;//initialize i
			Scanner in=new Scanner(System.in);//making a object of Scanner class
			int num[]=new int[4];//create a array size of 4		
			for(i=0;i<num.length;i++)
			{
				num[i]=Integer.parseInt(args[i]);
			}
			int smallest=num[0];//store initialize value of num into smallest
			int greatest=num[0];//store initialize value of num into greatest
			for(i=0;i<num.length;i++)
			{
				System.out.println(num[i]);
			}  
			for(i=0;i<num.length;i++)
			{
				if(num[i]>greatest)
				{
					greatest=num[i];
				}
				else if(num[i]<smallest)
				{
					smallest=num[i];
				}
			}
			System.out.println("Greatest number is : "+greatest);
			System.out.println("Smallest number is : "+smallest);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}