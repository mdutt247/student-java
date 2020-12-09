class helloTwenty_welcomeFifteen extends Thread
{
	public void run()
	{
		for(int i=0;i<15;i++)
		{
			System.out.println("Welcome");
		}
		for(int i=0;i<20;i++)
		{
			System.out.println("Hello");
		}
	}
	public static void main(String []args)
	{
		helloTwenty_welcomeFifteen t1=new helloTwenty_welcomeFifteen();
		t1.start();
	}
}