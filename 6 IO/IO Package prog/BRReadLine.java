import java.io.*;
class BRReadLine
	{
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str;
	System.out.println("Enter Lines of Text.");
	System.out.println("Enter 'Stop' to Quit.");
	do {
	str=br.readLine();
	System.out.println(str);
	}
	while(!str.equals("stop"));
	}
}
