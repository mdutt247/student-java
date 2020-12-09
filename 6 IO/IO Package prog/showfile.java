import java.io.*;
class showfile
{
	public static void main(String arg[]) throws IOException
	{
		int i;
		FileInputStream fin;

			//FileInputStream fin=new FileInputStream("abc.txt");
		 fin=new FileInputStream("adf.txt");
		 do{
			i=fin.read();
			if(i!=-1)
					{
						System.out.println((char)i);
					}

			}while(i!=-1);

			fin.close();

	}
}

