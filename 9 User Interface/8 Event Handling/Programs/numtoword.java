import java.util.Scanner;
public class numtoword
{
	
	public static void main(String arg[])
	{
		int a[]=new int[5];
		Scanner in=new Scanner(System.in);
		int num,reverse=0,n1,i=0;
		System.out.println("enter the number");
		num=in.nextInt();
		//n1=num;
		while(num>0)
		{
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
		}
		System.out.println(reverse);
		//System.out.println(n1);
		while(reverse>0)
		{
			a[i]=reverse%10;
			reverse=reverse/10;
			i++;
		}
		for(i=0;i<a.length-1;i++)
		{
			switch(a[i])
			{
				case 1:
				System.out.println("one");
				break;
				case 2:
				System.out.println("two");
				break;
				case 3:
				System.out.println("three");
				break;
				case 4:
				System.out.println("four");
				break;
				case 5:
				System.out.println("five");
				break;
				case 6:
				System.out.println("six");
				break;
				case 7:
				System.out.println("seven");
				break;
				case 8:
				System.out.println("eight");
				break;
				case 9:
				System.out.println("nine");
				break;
				case 0:
				System.out.println("zero");
				break;
			}
		}
		
	}
}