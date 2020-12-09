import java.lang.*;
import java.io.*;
public class readwritefile
{
	public static void main(String arg[]) throws IOException
	{
		//InputStreamReader inputreader=new InputStreamReader(System.in);
		//BufferedReader bufferstream=new BufferedReader(inputreader);

		BufferedReader bufferstream=new BufferedReader(new InputStreamReader(System.in));
		String readstring;
		do
		{
			System.out.print("\n please enter something- ");
			System.out.flush();
			readstring=bufferstream.readLine();
			System.out.println("hello user this is what you wrote- ");
			System.out.println(">" + readstring);
		}
		while(readstring.length() !=0);
	}
}