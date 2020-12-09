class ClassX
{
	int h=10;
}

interface IntA
{
	final int x = 10;
	void callback(int z);
	void method2();
}

interface IntB
{
	void sub(int x,int y);
	void add(int a,int b);
}

class ABX extends ClassX implements IntA,IntB
{
	public void callback(int p){
		System.out.println("square is: " + p*p);
	}
	public void method2(){
	}
	public void add(int z, int y){
		int sum = z+y;
		System.out.println("sum is: " + sum);
	}
	public void sub(int r,int s){
	}
}

public class Test
{
	public static void main (String[] args) {
 		ABX obj=new ABX();
 		obj.callback(5);
 		obj.add(5,4);
	}
}