//WAP to calculate the sum of odd integer between 1 to 99 using for loop.

class sum_odd_integer
{
	public static void main(String args[])
	{
		int sum=0;
		for(int i=2;i<99;i++)
		{
			if(i%2!=2)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}