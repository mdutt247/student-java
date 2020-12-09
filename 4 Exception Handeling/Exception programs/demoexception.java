class demoexception
{
	public static void main(String[] args) 
	{	int a=5,b=0,c;
		c=a/b;
		System.out.println("Division="+c);
		c=a/2;
		System.out.println("Division="+c);
	}
}

/*
D:\Program>javac demoexception.java

D:\Program>java demoexception
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at demoexception.main(demoexception.java:5)
*/