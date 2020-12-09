import java.io.*;

class Area
{
	int r,l,b,c;
	double a;
	Area(){
		a=0.0;
		r=l=b=c=0;
	}

	void initilialValues(){
		System.out.println("a = " + a + " r = " + r + " l = " + l + " b = "+ b + " c = " + c);
	}
	void areaOfCircle(int rad){
		r=rad;
		a=3.14*r*r;
		System.out.println("area of circle is: " + a);
	}

	void areaOfRect(int len, int brd){
		l=len;
		b=brd;
		c=l*b;
		System.out.println("area of rectangle is: " + c + "\n");
	}
}

class ConstructorDemo
{
	public static void main(String args[])
	{
		Area obj = new Area();
		obj.initilialValues();
		obj.areaOfCircle(5);
		obj.areaOfRect(5,10);

		Area obj2 = new Area();
		obj2.initilialValues();
		obj2.areaOfCircle(4);
		obj2.areaOfRect(6,11);
	}
}
