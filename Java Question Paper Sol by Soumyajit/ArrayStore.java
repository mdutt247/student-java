import java.util.Scanner;
class ArrayStore{
	public static void main(String args[])
	{
		int even=0,odd=0,negative=0,positive=0;
		int a[]= new int[5];
			for(int i=0;i<a.length;i++)
			{
				Scanner in = new Scanner(System.in);
				System.out.println("Enter "+(i+1)+" Number:");
				a[i] = in.nextInt();
			}
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%2==0)
				{
					even++;
				}
			}
			System.out.println("Even Numbers are :"+even);
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%2==0)
				{
					
					System.out.println(a[j]);
				}
			}
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%2!=0)
				{
					odd++;
				}
			}
			System.out.println("odd Numbers are:"+odd);
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%2!=0)
				{
					
					System.out.println(a[j]);
				}
			}
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>=0)
				{
					positive++;
				}
			}
			System.out.println("Positive Numbers are:"+positive);
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>=0)
				{
					
					System.out.println(a[j]);
				}
			}
			for(int j=0;j<a.length;j++)
			{
				if(a[j]<0)
				{
					negative++;
				}
			}
			System.out.println("Negative Numbers are :"+negative);
			for(int j=0;j<a.length;j++)
			{
				if(a[j]<0)
				{
					
					System.out.println(a[j]);
				}
			}
	}
}
