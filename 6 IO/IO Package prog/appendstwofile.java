import java.io.*;
public class appendstwofile
{
	public static void append(String filename,String filename1) throws IOException
	{
		File f=new File(filename);
		long filelength=f.length();
		RandomAccessFile raf=new RandomAccessFile(f,"rw");
		raf.seek(filelength);
		raf.writeBytes(def.txt);
		raf.close();
	}
	/*public static void append(String filename,byte[] bytes) throws IOException
	{
		File f=new File(filename);
		long filelength=f.length();
		RandomAccessFile raf=new RandomAccessFile(f,"rw");
		raf.seek(filelength);
		raf.write(bytes);
		raf.close();
	}*/
	public static void main(String arg[]) throws IOException
	{
		append("abc.txt","def.txt");
		//append("def.txt","Appended data".getBytes());
	}
}
	