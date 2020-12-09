class ParentClass
{
	void print(){
		System.out.println("Printing in parent class");
	}
	void parentMethod(){
		System.out.println("Another method of parent class");
	}
}

class ChildClass extends ParentClass
{
	void print(){
		System.out.println("Printing in child class");
	}
	void childMethod(){
		System.out.println("Another method of child class");
	}
}

class OverridingDemo
{
	public static void main(String[] a){
		ChildClass childObj = new ChildClass();
		childObj.print();
	}
}