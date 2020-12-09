class Odd implements Runnable
{
	Thread t;
	String name;

	Odd(String tname)
	{
		name=tname;
		t= new Thread(this,name);
		System.out.println("Creating " + name);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=30;i=i+2)
			{
				System.out.println("Odd no: " + i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread "+ name + " interrupted");
		}
		System.out.println("Thread "+ name + " existing");
	}

}
class Even implements Runnable
{
	Thread t;
	String name;

	Even(String tname)
	{
		name=tname;
		t= new Thread(this,name);
		System.out.println("Creating " + name);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=2;i<=30;i=i+2)
			{
				System.out.println("Even no: " + i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread "+ name + " interrupted");
		}
		System.out.println("Thread "+ name + " existing");
	}

}
public class OddEven
{
	public static void main(String arg[])
	{
		Odd o=new Odd("Odd Thread");
		try
		{
		Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
		}
		Even e=new Even("Even Thread");
	}
}