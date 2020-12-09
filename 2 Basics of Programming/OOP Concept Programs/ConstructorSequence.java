class A
{
	public A(){
		System.out.println("1");
	}
}

class B extends A
{
	public B(){
		System.out.println("2");
	}
}

class C extends B
{
	public C(){
		System.out.println("3");
	}
}

class ConstructorSequence
{
	public static void main(String a[]){
		System.out.println("Creating object of C class");
		C obj = new C();
		System.out.println("After object of C class is created");
	}
}