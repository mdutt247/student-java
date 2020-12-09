//Derive a class Square from class Rectangle. Create an interface with only one method called Area(). Impliment this interface in all classes. Include appropriate data members and constructors in all classes.
interface Findarea{
    public void area();
}

class Rectangle implements Findarea{
	int l, b;
	public Rectangle(int length, int bredth){
		l = length;
		b = bredth;
	}

    public void area(){
		System.out.println("Area of Rectanle : " + (l*b));          
    }
}

class Square extends Rectangle{
	public Square(int s){
		super(s, 1);
	}
    public void area(){
		System.out.println("Area of Square : " + (l*l));           
    }
}

public class InterfaceRectangleSquare{
	public static void main(String a[])	{
		Rectangle rect = new Rectangle(3,4);
		rect.area();
		Square sqr = new Square(3);
		sqr.area();
	}
}