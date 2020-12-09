import java.util.Scanner;
public class length_string
{
	public static void main(String []args)
	{
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string value : ");
		str=in.nextLine();
		System.out.println("Length of string is " + str.length());
	}
}