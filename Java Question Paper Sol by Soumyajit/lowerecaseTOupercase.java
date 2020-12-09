import java.io.*;
class lowerecaseTOupercase
{
	public static void main(String []args)throws Exception
	{
		String str=args[0];
		FileOutputStream fos=new FileOutputStream("D:\\lowerecaseTOupercase.txt");
		byte b[]=str.toUpperCase().getBytes();
		fos.write(b);
		fos.close();
		System.out.println(str);
	}
}