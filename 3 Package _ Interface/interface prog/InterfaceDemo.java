interface FirstInterface
{
	void display();
	void print(int param);
}

class MyClass1 implements FirstInterface
{
	public void display(){
		System.out.println("Implemented FirstInterface.display() by MyClass1");
	}

	public void print(int i){
		System.out.println("Implemented FirstInterface.print(int) by MyClass1: " + i);
	}

	public void thisClassMethod(){
		System.out.println("Myclass1.thisClassMethod()");
	}

}

class MyClass2 implements FirstInterface
{
	public void display(){
		System.out.println("Implemented FirstInterface.display() by MyClass2");
	}

	public void print(int i){
		System.out.println("Implemented FirstInterface.print(int) by MyClass2: " + i);
	}
}

class InterfaceDemo
{
	public static void main(String[] arg){
		MyClass1 idemo = new MyClass1();
		idemo.display();
		idemo.print(33);
		idemo.thisClassMethod();
		System.out.println("");
		MyClass2 idemo2 = new MyClass2();
		idemo2.display();
		idemo2.print(55);
	}
}