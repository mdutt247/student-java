import java.util.Scanner;
class Employee
{
	int emp_no;
	String emp_name="";
	int basic_sal;
}
class officer extends Employee
{
	double travelallowance;
}
class manager extends officer
{
	Scanner in=new Scanner(System.in);
	int educationallowance=5000;
	public void get()
	{
		System.out.println("Enter the emp_name");
		emp_name=in.nextLine();
		System.out.println("Enter the emp_no");
		emp_no=in.nextInt();
		System.out.println("Enter the basic salary");
		basic_sal=in.nextInt();
		travelallowance=(basic_sal*0.10);
	}
	public void print()
	{
		System.out.println("Employee id:" +emp_no);
		System.out.println("Employee name:" +emp_name);
		System.out.println("Employee basic salary:" +basic_sal);
		System.out.println("Employee travel allowance:" +travelallowance);
		System.out.println("Employee education allowance:" +educationallowance);
	}
	public static void main(String arg[])
	{
		manager x1=new manager();
		x1.get();
		x1.print();
	}
}