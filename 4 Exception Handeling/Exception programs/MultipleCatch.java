class MultipleCatch
{
	public static void main(String s[]){

	try{
		int a[] = new int[5];
		//a[5] = 40/0;
		a[5] = 40/2;
	}
	catch(ArithmeticException e){
		System.out.println("Arithmetic Exception");
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Array index out of bound");
	}
	catch(Exception e){
		System.out.println("Other Exception");
	}

	System.out.println("Rest of code");
	}
}