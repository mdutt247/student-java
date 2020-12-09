package pk1;
public class SameNonSub
{
	public void display()
	{
		AccessControl obj =new AccessControl();
		//System.out.println("Difault value is : " +obj.a);
		System.out.println("Public value is : " +obj.b);
		System.out.println("Protected value is : " +obj.c);
		//System.out.println("Private value is : " +obj.d);
	}
	public static void main(String []args)
	{
		SameNonSub obj1 = new SameNonSub();
		obj1.display();
	}
}