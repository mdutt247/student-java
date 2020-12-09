public class Area_tri_rect
{
	public static double area(double val1) 
	{
		double area_triangle;
		int base = 10;
		area_triangle = 0.5 * val1 * base;
		return area_triangle;
	}
	public static double area(double val1, double val2) {
		double area_rectangle;
		area_rectangle = val1 * val2;	
		return area_rectangle;
	}
	public static void main(String[] args) {
		System.out.println("The area of the triangle is " + area(5));
		System.out.println("The area of the rectangle is " + area(10, 20));
	}
}