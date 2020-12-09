class GeneratePrimeNo
{
	public static void main(String args[])
	{
		int num1,num2;
		int flag=0;
		for(num1=1;num1<=100;num1++)
		{
			flag=0;
			for(num2=1;num2<num1;num2++)
			{
 				if(((num1%num2)==0) & num2!=1)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println(num1+"\n");
			}
		}
	}
}
