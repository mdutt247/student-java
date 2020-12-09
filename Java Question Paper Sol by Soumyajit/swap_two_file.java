//WAP to swap contents of two files.
import java.io.*;
import java.io.BufferedWriter;
 
public class swap_two_file 
{
	public static void main(String[] args) 
	{
		try 
		{
			//copy the contents of file1.txt to temp.txt
			String temp = "";
			BufferedReader br = new BufferedReader(new FileReader("File1.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("temp.txt"));
			while((temp = br.readLine()) != null)
			{
				bw.write(temp);
				bw.newLine();
				bw.flush();
			}
			//copy the contents of file2.txt to a file1.txt
			br = new BufferedReader(new FileReader("File2.txt"));
			bw = new BufferedWriter(new FileWriter("File1.txt"));
			while ((temp = br.readLine()) != null) 
			{
				bw.write(temp);
				bw.newLine();
				bw.flush();
			}
			//copy the contents of temp.txt to file2.txt
			br = new BufferedReader(new FileReader("temp.txt"));
			bw = new BufferedWriter(new FileWriter("File2.txt"));
			while ((temp = br.readLine()) != null) 
			{
				bw.write(temp);
				bw.newLine();
				bw.flush();
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}