class prime
{
	public static void main(String []args)
	{
		int n=Integer.parseInt(args[0]);//n=3
		int i,flag=0;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
				flag=1;
                break;
            }
        }
		if (flag==0)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
		
	}
}