class divided_seven extends Thread
{
	public void run()
	{
		for(int i=1;i<20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		for(int i=1;i<20;i++)
		{
			if(i%7==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String []args)
	{
		divided_seven d1=new divided_seven();
		d1.start();
	}
}