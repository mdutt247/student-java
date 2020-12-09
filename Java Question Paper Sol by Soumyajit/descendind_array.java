import java.util.Scanner;
public class descendind_array
{
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		int a[] = new int[10];
		int temp , i;
		System.out.println("Enter 10 numbers : ");
		for(i=0;i<10;i++)
		{
			a[i]=scanner.nextInt();
		}
		
		System.out.println("Your entered numbers are :");
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		
		for(i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Descending :");
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}
}