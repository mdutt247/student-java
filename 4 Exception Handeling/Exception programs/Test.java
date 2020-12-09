import java.io.*;
class my extends Exception
{
	public String toString()
	{	return "Negative numbers are not allowed";                }
}

class Test 
{
	public static void main(String[] args) throws IOException
	{
		int n;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("\nEnter the value of n");
		n=Integer.parseInt(d.readLine());
		try
		{
			if(n<0)
			{
				throw new my();
			}
			else
			{
				if(n%2==0)
					System.out.println("even");
				else
					System.out.println("even");
			}
			
		}
		catch (my e)
		{
			System.out.println("caught the exception:\n"+e);
		}
		
	}
}

/*
D:\Program>javac Test.java

D:\Program>java Test

Enter the value of n
-1
caught the exception:
Negative numbers are not allowed
*/

/*
D:\Program>java Test

Enter the value of n
78
even
*/