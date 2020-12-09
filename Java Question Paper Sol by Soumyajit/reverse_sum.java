class reverse_sum
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);//12345
		int rev=0;
		int sum=0;
		int t = num;//12345
		while(t!=0)
		{
			rev=rev*10;//{rev=0 0*10=0},{rev=5 5*10=50},{rev=54 54*10=540},{rev=543 543*10=5430},{rev=5432 5432*10=54320}
			//sum=sum+(t%10);
			rev = rev+t%10;//{rev=((rev=0)+(t%10=5))=5} , {rev=(rev=50)+(t%10=4)=54} , {rev=(rev=540)+(t%10=3)=543} , {rev=(rev=5430)+(t%10=2)=5432} , {rev=(rev=54320)+(t%10=1)=54321}
			t=t/10;//1234,123,12,1,0 break
		}
		System.out.println("Reverse number is : "+rev);
		//System.out.println("Sum is : "+sum);
	}
}