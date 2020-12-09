class OverloadingMainMethod
{


	public static void main(String[] a){
		System.out.println("\nmain(String[]) executed- entry point of program\n");

		MainClass m = new MainClass();
		System.out.println("Calling main(int) ");
		m.main(10);
		System.out.println("Calling main(double) ");
		m.main(10.5);

		System.out.println("Program ended");
	}
}

class OverloadedMainClass
{
	public static void main(int i){
		System.out.println(i);
	}

	public static void main(double d){
		System.out.println(d);
	}
}