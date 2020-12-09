//copy file...
import java.io.*;

class WriteFileDemo1
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fin=new FileInputStream(args[0]);
		FileOutputStream fout=new FileOutputStream(args[1]);
		
		int i;
	
			do
			{
				i=fin.read();
				if(i !=-1) fout.write(i);
				
			}
			while(i!=-1);

		fin.close();
		fout.close();
	}
}