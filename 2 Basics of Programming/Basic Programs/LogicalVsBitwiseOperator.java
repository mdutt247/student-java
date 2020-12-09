class LogicalVsBitwiseOperator
{
	public static void main(String args[])
	{

	int a=42, b=15;

	System.out.println(a<4 && b>6); //false
	System.out.println(a & b); //10
	System.out.println(a<4 || b>6); //true
	System.out.println(a | b); //47
	}
}