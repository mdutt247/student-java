import java.util.*;
class smallest_among_three_no
{
	public static void main(String []args)
	{
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter three number : ");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a<b&&a<c)
		{
			System.out.println(a+" is smallest.");
		}
		else if(b<a&&b<c)
		{
			System.out.println(b+" is smallest.");
		}
		else
		{
			System.out.println(c+" is smallest.");
		}
	}
}