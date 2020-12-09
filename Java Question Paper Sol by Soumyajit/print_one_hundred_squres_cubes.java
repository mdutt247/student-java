import java.util.*;
class print_one_hundred_squres_cubes
{
	public static void main(String args[])
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
		for(int i=1;i<=100;i++)
		{
			System.out.println(Math.pow(i,2));
		}
		for(int i=1;i<=100;i++)
		{
			System.out.println(Math.pow(i,3));
		}
	}
}