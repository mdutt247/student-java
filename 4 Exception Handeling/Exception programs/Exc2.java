class Exc2
	{
	public static void main(String args[])
	{
	int a=0;
try{
	int d=40/a;
	System.out.println("This will not be printed");
	}
catch(ArithmeticException e)
	{
	System.out.println("Division by Zero");
	}
	System.out.println("After Catch Statement");
	}
}