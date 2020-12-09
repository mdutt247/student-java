class prime_between
{
	public static void main(String args[])
	{
		int first=Integer.parseInt(args[0]);
		int last=Integer.parseInt(args[1]);
		int i,flag=0,j;
		for(i=first;i<=last;i++)
		{
			flag=1;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
				if(flag==1){
						System.out.println(i);	
				}
			
			
		}
	}
}