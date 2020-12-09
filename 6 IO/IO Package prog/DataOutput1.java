import java.io.FileOutputStream;

public class DataOutput1
	{
    	public static void main(String[] args) throws Exception
	{
        	String file = args[0];
        	String output = "Hello World";
        	FileOutputStream fout = new FileOutputStream(file);
        	char[] outputAsChars = output.toCharArray();

        	for (int i = 0; i < outputAsChars.length; ++i)
           	 fout.write(outputAsChars[i]);
    }
}
