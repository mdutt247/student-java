package pk1;
public class SameSub extends AccessControl
{
	public void display()
	{
		AccessControl obj =new AccessControl();
		obj.display();
		System.out.println("Difault value is : " +obj.a);
		System.out.println("Public value is : " +obj.b);
		System.out.println("Protected value is : " +obj.c);
		//System.out.println("Private value is : " +obj.d);
	}
		public static void main(String []args)
	{
		SameSub obj1 = new SameSub();
		obj1.display();
	}
}