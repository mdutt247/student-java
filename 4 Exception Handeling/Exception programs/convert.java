import java.io.*;
class convert
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.println("Enter temp:");
		String text=input.readLine();
		int f=new Integer(text).intValue();
		System.out.println("F="+f);
		int c=5 * (f-32)/9;
		System.out.println("c="+c);
	}
}

