import java.lang.Thread;
import java.lang.System;
import java.lang.InterruptedException;
class Mythread extends Thread
{
	static String message[]={"I","love","java","very","much"};
	public Mythread(String id)
	{
		Super(id);
	}
	public void run()
	{
		Sync.displayList(getName(),message);
	}
	void waiting()
	{
		try
		{
			Sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
	}
}
class sync
{
	public static void Syncohronized displaylist(String name,String list[])
	{
		for(int i=0;i<list.length;i++)
		{
			Mythread thread=(Mythread)Thread.currentThread();
			Thread.waiting();
			System.out.println(name + list[i]);
		}
	}
}
class threadsync
{
	public static void main(String arg[])
	{
		Mythread thread1=new Mythread("thread1");
		Mythread thread2=new Mythread("thread2");
		thread1.start();
		thread2.start();
	}
}