class threadexp1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("hello");
		}
	}
}
class threadexp2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("everyone");
		}
	}
}
class multithreadexp 
{
	public static void main(String arg[])
	{
		threadexp1 x1=new threadexp1();
		x1.start();
		threadexp2 x2=new threadexp2();
		x2.start();
	}
}