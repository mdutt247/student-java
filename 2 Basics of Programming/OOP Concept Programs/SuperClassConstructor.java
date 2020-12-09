import java.io.*;

class ClassTwo
{
	int length,breadth;
	ClassTwo(int x,int y)
	{
		length=x;
		breadth=y;
	}
	int area()
	{
		return (length*breadth);
	}
}

class ClassThree extends ClassTwo
{
	int height;
	ClassThree(int x,int y,int z)
	{
		super(x,y);
		height=z;
	}
	int volume()
	{
		return(length*breadth*height);
	}
}

class SuperClassConstructor
{
	public static void main(String arg[])
	{
	int x;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try{
		System.out.println("Enter The Length :");
		int l=Integer.parseInt(br.readLine());
		System.out.println("Enter The Breadth :");
		int b=Integer.parseInt(br.readLine());
		System.out.println("Enter The Height :");
		int h1=Integer.parseInt(br.readLine());

		ClassThree h=new ClassThree(l,b,h1);
		x = h.area();
		System.out.println("\nArea: " + x);
		x = h.volume();
		System.out.println("Volume: " + x);
	}
	catch(Exception e){}
	}
}