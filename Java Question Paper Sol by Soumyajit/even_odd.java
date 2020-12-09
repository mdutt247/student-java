class even_odd extends Thread
{
	public void run()
	{
		System.out.println("First 15 even numbers are:");
		for(int i=1;i<=15;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("First 15 odd numbers are:");
		for(int i=1;i<=15;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String []args)
	{
		even_odd t1=new even_odd();
		t1.start();
	}
}