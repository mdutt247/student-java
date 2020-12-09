import java.io.FileInputStream;

public class DataInput1
	{
    public static void main(String[] args) throws Exception
		{
        	String file = args[0];
        	int input;
        	FileInputStream fin = new FileInputStream(file);
        	while ( (input = fin.read()) != -1){
            	System.out.print((char) input);
       		 }
   	 }
}
