class OverloadingDemo
{
	double area,root;

	// Area Of Square
	public void Area(double a)
	{
		area = a*a;
		System.out.println("The Area Of Square : " + area);
	}

	// Area of Rectangle
	public void Area(double a, double b)
	{
		area = a*b;
		System.out.println("The Area Of Rectangle : " + area);
	}

	public static void main(String args[])
	{
		OverloadingDemo ar = new OverloadingDemo();
		ar.Area(5.65);
		ar.Area(5.32,43.2);
	}
}