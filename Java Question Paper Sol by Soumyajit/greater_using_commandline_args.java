class greater_using_commandline_args
{
	public static void main(String []args)
	{
		int i,j;
		i=Integer.parseInt(args[0]);
		j=Integer.parseInt(args[1]);
		if(i>j)
		{
			System.out.println(i+" is greater.");
		}
		else
		{
			System.out.println(j+" is greater.");
		}
	}
}