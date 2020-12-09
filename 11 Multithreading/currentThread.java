public class currentThread
{
	public static void main(String arg[])
	{
		Thread thisthread=Thread.currentThread();
		try
		{
			for(int counter=0;counter<10;counter+=2)
			{
				System.out.println(counter);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Hey! I was Interrupted");
		}
	}
}