package pk1;
public class AccessControl
{
	int a=10;
	public int b=20;
	protected int c=30;
	private int d=40;
 	public void display()
 	{
		System.out.println("Difault value is : " +a);
		System.out.println("Public value is : " +b);
		System.out.println("Protected value is : " +c);
		System.out.println("Private value is : " +d);
	} 

}