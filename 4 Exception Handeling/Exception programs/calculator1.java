import java.io.*;
class math
{
	
	int add(int x,int y)
	{
		int temp=x+y;
		return temp;
	}
	
	int sub(int x,int y)
	{
		int temp=x-y;
		return temp;
	}
	int mul(int x,int y)
	{
		int temp=x*y;
		return temp;
	}
	int div(int x,int y)
	{
		if(y==0)
		{
			System.out.println("Division error");
			return 0;
		}
		else
		{
		int temp=x/y;
		return temp;
		}
	}
	
	
}
class  calculator1
{
	public static void main(String[] args)  throws IOException
	{
		System.out.println("Hello World!");
		math m1=new math();
	int a=m1.add(5,5);
	System.out.println("Addition="+a);
	int s=m1.sub(10,5);
	System.out.println("Subtraction="+s);
	int m=m1.mul(5,5);
	System.out.println("Mul="+m);
	int d=m1.div(10,5);
	System.out.println("Division="+d);
	}
}
