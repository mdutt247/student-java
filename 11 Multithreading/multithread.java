//we are making program to create and run multi threading to print
//hello 10times
// every one 10times  /// class name spelling
class a extends Thread
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("hello");
		}
	}
}
class b extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("everyone");
		}
	}
}
class multithread
{
	public static void main (String arg[])
	{
	a x1=new a();
	x1.start();
	
	try
	{
		Thread.sleep(1000);//write this ok wait scroll up
	}
	catch(InterruptedException c)
	{
		System.out.println(c);
	}
	b x2=new b();//done ok'
	x2.start();
	}  
}
