class demofinally
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
		
		finally
		{
			System.out.println("close the file");
		}
		
	}
}

/*
D:\Program>java demofinally 12 6
Division=2
close the file
*/

/*
D:\Program>java demofinally 12 0
Denominator can not be zero
close the file
*/