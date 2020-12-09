class divide
{
	public static void main(String[] args) 
	{	int a,b,c;
		try
		{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
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
D:\Program>javac divide.java

D:\Program>java divide 12 4
Division=3        
*/

/*
D:\Program>java divide 12 0
Denominator can not be zero
*/

/*
D:\Program>java divide 12 a
Enter Integer numbers Only
*/