class prime extends Thread
{
	public void run()
	{
		int counter,i,j;
		System.out.println("Prime numbers are:");
		for(i=1;i<=20;i++)
		{
			counter=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					counter++;
				}
			}
			if(counter==2)
			{
				System.out.println(i);
			}
		}
	}
}
class fibonacci extends Thread
{
	public void run()
	{
		System.out.println("fibonacci series");
		int first=0,second=1,next,i;
		for(i=0;i<=10;i++)
		{
			if(i<=1)
			{
				next=i;
			}
			else
			{
				next=first+second;
				first=second;
				second=next;
			}
			System.out.println(next);
		}
	}
}
class hello extends Thread
{
	int i;
	public void run()
	{
		for(i=0;i<15;i++)
		{
			System.out.println("hello");
		}
	}
}
public class runthread
{
	public static void main(String arg[])throws InterruptedException
	{
		prime p=new prime();
		p.start();
		Thread.sleep(1000);
		fibonacci f=new fibonacci();
		f.start();
		Thread.sleep(1000);
		hello h=new hello();
		h.start();
	}
}