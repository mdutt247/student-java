import java.io.*;
class CopyFile
	{
	public static void main(String args[])throws IOException
	{
	int i;
	FileInputStream fin;
	FileOutputStream fout;
	
	try{
	fin=new FileInputStream(args[0]);
	}
	catch(FileNotFoundException e){
	System.out.println("Input File Not Found");
	return;
	}
	try{
            fout=new FileOutputStream(args[1]);
            }
catch(FileNotFoundException e)
{
	System.out.println("Error opening output from to");
	return;
	
	
	}catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("Usage:Copy file From to");
	return;
	}
	//copy file
	try{
 do{
i=fin.read(); 
if(i!=-1) fout.write(i);
} while(i!=-1);
}catch(IOException e)
{
System.out.println("File Error");
}
fin.close();
fout.close();
}
}

/* D:>javac CopyFile.java
D:>java CopyFile First.txt Second.txt */
