import java.util.Scanner;
public class transpose
{
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		int arr[][] = new int[4][4];
		int arrt[][]=new int[4][4];
		int i,j;
		System.out.println("Enter values of matrix :");
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				arr[i][j]=scanner.nextInt();
			}
		}
		System.out.println("You have entered :");
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				arrt[i][j]=arr[j][i];
			}
		}
		System.out.println("Transpose of matrix is: ");
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(arrt[i][j]+" ");
			}
			System.out.println();
		}
	}
}