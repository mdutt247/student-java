class NestedTry
{
	public static void main(String s[]){

		try{
			try{
				System.out.println("==Going to divide==");
				int b = 40/0;
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}
			try{
				System.out.println("==Creating array==");
				int a[] = new int[5];
				a[5] = 4;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}

			System.out.println("Normal flow inside outer try");
		}
		catch(Exception e){
			System.out.println("Exception handled");
		}

		System.out.println("Normal flow inside main");
	}
}