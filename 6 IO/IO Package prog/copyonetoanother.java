import java.io.*;
class copyonetoanother
{
	public static void main(String arg[]) throws IOException
	{
		FileInputStream fin=new FileInputStream(arg[0]);
		FileOutputStream fout=new FileOutputStream(arg[1]);
		int i;
		while((i=fin.read())!=-1)
		{
			fout.write(i);
			System.out.print((char)i);
		}
		fin.close();
	}
}