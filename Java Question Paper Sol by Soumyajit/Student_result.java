import java.util.*;
public class Student_result
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int roll_number;
		String name;
		int total=0;
		float per;
		int marks[]=new int[4];
		
		System.out.println("Enter Name:");
		name=in.next();
		
		System.out.println("Enter roll number");
		roll_number=in.nextInt();
		
		System.out.println("Enter Marks of 4 subjects:");
		for(int i=0;i<=3;i++)
		{
			marks[i]=in.nextInt();
		}
		
		System.out.println("Total Marks:");
		for(int i=0;i<=3;i++)
		{
			total=total+marks[i];
		}
		
		System.out.println(total);
		
		System.out.println("Percentage:");
		per=(total*100)/400;
		System.out.println(per+"%");
		System.out.println("Result");
		System.out.println("Student name:"+name);
		System.out.println("Student roll number:"+roll_number);
		System.out.println("Student percentage:"+per);
	}
}
