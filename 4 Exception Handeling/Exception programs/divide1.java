class divide1
{
	public static void main(String[] args) 
	{	int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);

		try
		{
			c=a/b;
			System.out.println("Division="+c);
		}

		catch (ArithmeticException e)
		{
			System.out.println("Denominator can not be zero");
		}

		catch(NumberFormatException e)
		{
			System.out.println("Enter Integer numbers Only");
		}

		c=a/2;
		System.out.println("Division="+c);
		
	}
}

/*
D:\Program>java divide1 12 6
Division=2
Division=6	*/

/*D:\Program>java divide1 12 0
Denominator can not be zero
Division=6	*/