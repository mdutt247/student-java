//Display tables of numbers between two  numbers accepted as cmd line args.
public class table_number
{
	public static void main(String args[])
	{
		int first=Integer.parseInt(args[0]);
		int last=Integer.parseInt(args[1]);
		for(int i=first;i<=last;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}
}
