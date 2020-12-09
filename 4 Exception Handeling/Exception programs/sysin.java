import java.io.*;
class sysin
{
	public static void main(String args[]) throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter your name:");
		String name=in.readLine();
		System.out.println(name);
	}
}