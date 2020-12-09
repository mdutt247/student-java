//import java.lang.thread;
class thread1 extends Thread
{
   public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("hello");
		}
	}
}
class thread2 extends Thread
{
   public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("everyone");
		}
	}
}
public class thread3
{
	public static void main(String arg[])
	{
		thread1 x1=new thread1();
		x1.start();
		thread2 x2=new thread2();
		x2.start();
	}
}