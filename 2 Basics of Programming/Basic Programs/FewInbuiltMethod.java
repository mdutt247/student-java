import java.io.DataInputStream;

class FewInbuiltMethod
{
	public static void main(String a[])
	{
	String s1,s2;

	StringBuffer strBuffer = new StringBuffer("Institute");
	System.out.println(" " + strBuffer);

	st.append(" Of Business Studies and");
	System.out.println(" " + strBuffer);

	st.insert(33," Research");
	System.out.println(" " + strBuffer);

	try
	{
		DataInputStream inputStream = new DataInputStream(System.in);
		System.out.println("Enter any String: ");
		s1 = inputStream.readLine();

		s2 = s1.toLowerCase();
		System.out.println("S2 = " + s2);

		s2 = s1.toUpperCase();
		System.out.println("S2 = " + s2);

		s2 = s1.replace('x','y');
		System.out.println("S2 = " + s2);

		System.out.println("Math Function: ");
		System.out.println("Square Root: " + Math.sqrt(25));
		System.out.println("Sin: " + Math.sin(90));
		System.out.println("Cos: " + Math.cos(90));
	}
	catch(Exception e){}
	}
}