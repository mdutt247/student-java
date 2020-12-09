import java.io.*;
class randomaccessfile 
{
	public static void main(String arg[]) throws IOException
	{
		RandomAccessFile file1=new RandomAccessFile("abc.txt","rw");
		RandomAccessFile file2=new RandomAccessFile("def.txt","rw");
		file1.seek(0);
		int i=0;
		while(file1.readLine()!=null)
		{
			i++;
		}
		file1.seek(0);
		file2.seek(file2.length());
		String s="";
		while(i>0)
		{
			s=file1.readLine();
			file2.writeBytes(s);
			i--;
		}
		System.out.println("content of file abc.txt appends to def.txt sucessfully");
		file2.close();
		file1.close();
	}
}