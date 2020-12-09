import java.io.*;

class ReadFileDemo
{
	public static void main(String args[])throws IOException
	{
		int i;
		FileInputStream fin;
		try
		{
			fin=new FileInputStream(args[0]);
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File NOt Found");
			return;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("No File Name Specified");
			return;
			
		}
		do
		{
			i=fin.read();
			if(i!=-1)
			System.out.println((char)i);
			
		}
		while(i!=-1);
		fin.close();
		
	}
	
}