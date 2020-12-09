import java.io.*;

class Example
{
	public static void main(String args[]) //throws IOException
	{
		try
		{
			DataInputStream in=new DataInputStream(System.in);
			System.out.println("Enter your name:");
			String name=in.readLine();
			System.out.println(name);
			System.out.println("Enter number1:");
			String number1=in.readLine();
			int n1=Integer.parseInt(number1);
			System.out.println("Enter number2:");
			System.out.println(n1);
			String number2=in.readLine();
			int n2=Integer.parseInt(number2);
			int ans=n1/n2;
			System.out.println("Division="+ans);
		}
		catch (IOException e)	
		{
			System.out.println("IO Exception");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divide by zero");
		}
	}
}