import java.util.*;
class armstrong_number
{
	public static void main(String []args)
	{
		int num , sum = 0 , rem = 0 , cube = 0 , temp;
		num=Integer.parseInt(args[0]);
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			//cube = (int)(Math.pow(rem,3));
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Number is an armstrong number");
		}
		else
		{
			System.out.println("Number is not an armstrong number");
		}
	}
}