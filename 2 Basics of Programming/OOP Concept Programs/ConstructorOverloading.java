import java.io.*;

class Area
{
	int r,l,b;
	double a;
	Area(){
		a = 0.0;
		r = l = b = 0;
	}
	Area(int rad){
		r = rad;
	}
	Area(int len, int brd){
		l = len;
		b = brd;
	}

	void areaOfCircle(){
		System.out.println("area of circle is: " + 3.14*r*r + "\n");
	}

	void areaOfRect(){
		System.out.println("area of rectangle is: " + l*b + "\n");
	}
}

class ConstructorOverloading
{
	public static void main(String args[])
	{
		Area cir = new Area(4);
		cir.areaOfCircle();

		Area rec = new Area(5,6);
		rec.areaOfRect();
	}
}