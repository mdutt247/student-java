class RunnableDemo implements Runnable
{
	Thread t;
	String name;
	int pr;

	RunnableDemo(String tname, int p)
	{
		name=tname;
		pr=p;
	//	t= new Thread(this,name);
		System.out.println("creating" + name + " |  " + t);
		//t.start();
	}
	public void run()
	{
		System.out.println("Running" + name);
		try
		{
			for(int i=4;i>0;i--)
			{
				System.out.println("thread: "+ name +", " + i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread "+ name + " interrupted");
		}
		System.out.println("Thread "+ name + " existing");
	}
	public void start()
	{
		System.out.println("starting " + name);
		if(t==null)
		{
			t=new Thread (this,name);
			t.setPriority(pr);
			t.start();
		}
	}
}
public class Testthread
{
	public static void main(String arg[])
	{
		RunnableDemo R1=new RunnableDemo("Thread-1",Thread.MIN_PRIORITY);
		R1.start();

		RunnableDemo R2=new RunnableDemo("Thread-2",Thread.MAX_PRIORITY);
		R2.start();
	}
}