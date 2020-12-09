//WAJP to accept binary number from user and convert into decimal.
import java.util.*;
class binary_decimal
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a binary number : ");
		int num=in.nextInt();
		int binary_val,decimal_val=0,base=1,rem;
		binary_val = num;
		while (num > 0)
		{
			rem = num % 10;
			decimal_val = decimal_val + rem * base;
			num = num / 10 ;
			base = base * 2;
		}
		System.out.println(decimal_val);
	}
}