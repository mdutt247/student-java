class demohandleexception
{
	public static void main(String[] args) 
	{	int a=5,b=0,c;
		try
		{
			c=a/b;
			System.out.println("Division="+c);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Denominator can not be zero");
		}
		
		c=a/2;
		System.out.println("Division="+c);
	}
}

/*
D:\Program>javac demohandleexception.java

D:\Program>java demohandleexception
Denominator can not be zero
Division=2
*/