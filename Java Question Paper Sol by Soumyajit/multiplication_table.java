class multiplication_table
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		for(int i=0;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+i*num);
		}
	}
}