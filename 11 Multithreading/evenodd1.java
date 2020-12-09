class even1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("even number:" + i);
			}
		}
	}
}
class odd1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.println("odd number:" + i);
			}
		}
	}
}
public class evenodd1
{
	public static void main(String arg[])
	{
		even1 x1=new even1();
		x1.start();
		odd1 x2=new odd1();
		x2.start();
	}
}