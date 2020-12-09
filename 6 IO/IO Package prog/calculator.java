import java.io.*;
class math
{
	int num1,num2;
	void getdata() throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter Value of number1:");
		num1=Integer.parseInt(in.readLine());
		System.out.println("Enter Value of number2:");
		num2=Integer.parseInt(in.readLine());
	}

	void putdata()
	{
		System.out.println("number1:"+num1);
		System.out.println("number2:"+num2);
	}
	void add()
	{
		int a=num1+num2;
		System.out.println("addition is:"+a);
	
	}
	void sub()
	{
		int b=num1-num2;
		System.out.println("sub is:"+b);
	
	}
	void mul()
	{
		int a=num1*num2;
		System.out.println("mul is:"+a);
	
	}
	void div()
	{
		int a=num1/num2;
		System.out.println("division is:"+a);
	
	}

}
class  calculator
{
	public static void main(String[] args)  throws IOException
	{
		System.out.println("Hello World!");
		math m1=new math();
		m1.getdata();
		m1.putdata();
		m1.add();
		m1.sub();
		m1.mul();
		m1.div();
	}
}
