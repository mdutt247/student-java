import java.io.*;
class SimpleRead
{
	 public static void main(String args[])
	 {
		  try
		  {
			FileInputStream fin=new FileInputStream(args[0]);
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			fin.close();
		  }
		  catch(Exception e)
			{
			System.out.println(e);
			}
	 }
}