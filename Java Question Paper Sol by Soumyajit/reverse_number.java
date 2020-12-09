import java.util.*;
class reverse_number
{
	public static int reverse()
	{
		Scanner in=new Scanner(System.in);
		int n,rev=0;
		System.out.println("Enter a number:");
		n=in.nextInt();
		while (n!=0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		return rev;
	}
	public static void main(String []args)
	{
		System.out.println(reverse());
	}
}