/*
WAP to create a class Rectangle.It should display area of rectangle & volume of rectangle.Use proper method & make use
of consructor.
*/
class Rectangle
{
	public double len,bre,height;
	Rectangle(double l , double b , double h)
	{
		len=l;
		bre=b;
		height=h;
	}
	public void area()
	{
		System.out.println(len*bre);
	}
	public void volume()
	{
		System.out.println(len*bre*height);
	}
	public static void main(String args[])
	{
		Rectangle obj=new Rectangle(10,20,30);
		obj.area();
		obj.volume();
	}
}