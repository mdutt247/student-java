class MultiCatch
	{
	public static void main(String args[])
	{
	
try{	int a=args.length;
	System.out.println("a="+a);
	int b=40/a;
	int c[]=new int[4];		
	c[42]=99;
	
	}
catch(ArithmeticException e)
	{
	System.out.println("Division by Zero");
	}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("Array index out of bound");
	}
	System.out.println("After Try/Catch Block");
}
}