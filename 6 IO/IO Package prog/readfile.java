import java.io.*;
class readfile 
{
	public static void main(String arg[]) throws IOException
	{
		FileInputStream fin=new FileInputStream("SimpleRead.java");
		int i;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}