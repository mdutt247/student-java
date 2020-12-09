//7)WAP to create and run thread to genrate 10 terms of fibonic series.
class fibonic extends Thread
{
	public void run()
	{
		int first=0,second=1,next;
		for(int i=0;i<10;i++)
		{
			if ( i <= 1 )
			{
				next = i;
			}		
			else
			 {
				next = first + second;
				first = second;
				second = next;
			}
			System.out.println(next);
		}
	}
	public static void main(String []args)
	{
		fibonic obj=new fibonic();
		obj.start();
	}
}