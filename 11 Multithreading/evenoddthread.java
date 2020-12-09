 class threadeven extends Thread
{
  public void run()
	{
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
			System.out.println("even" + i);
			}
		}
	}
}
 class threadodd extends Thread
{
   public void run()
	{
		for(int j=1;j<=30;j++)
		{
			if(j%2!=0)
			{
				System.out.println("odd" + j);
			}
		}
	}
}
public class evenoddthread
{
	public static void main(String arg[])
	{
		threadeven x1=new threadeven();
		x1.start();
		//new threadodd().start();
		threadodd x2=new threadodd();
		x2.start();
	}
}