class Exc1
	{
	public static void main(String args[])
	{
	int d=0;
try{
	int a=42/d;
	}
catch(ArithmeticException e){
	System.out.println("no.can not Divideary by Zero");
	}
	System.out.println("After Divison by Zero");
}
}