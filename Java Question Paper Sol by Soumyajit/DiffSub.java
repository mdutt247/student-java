package pk2;
import pk1.*;
public class DiffSub extends AccessControl
{
	public void display()
	{
		//AccessControl obj =new AccessControl();
		// System.out.println("Difault value is : " +obj.a);
		System.out.println("Public value is : " + b);
		System.out.println("Protected value is : " +c);
		//System.out.println("Private value is : " +obj.d);
	}
	public static void main(String []args)
	{
		DiffSub obj1 = new DiffSub();
		obj1.display();
	}
}