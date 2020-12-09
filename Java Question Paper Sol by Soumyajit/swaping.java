import java.util.Scanner;
public class swaping
{
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		int x,y;
		System.out.println("Enter a number : ");
		x=scanner.nextInt();
		System.out.println("Enter a number :");
		y=scanner.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swaping of number is :"+ "\n" + x+ "\n" +y);

	}
}