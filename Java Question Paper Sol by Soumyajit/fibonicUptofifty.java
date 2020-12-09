//7)WAP to to display fibonacci series upto 50.
class fibonicUptofifty
{
	public static void main(String []args)
	{
		int first=0,second=1,next;
		for(int i=0;i<50;i++)
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
}