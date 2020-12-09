import java.io.DataInputStream;

class HarmonicSeriesSum
{
	public static void main(String args[])
	{
		int n;
		float temp,sum=0.0F;
		DataInputStream in = new DataInputStream(System.in);
		System.out.println("Harmonic series : 1 + 1/2 + 1/3 + ......+ 1/n \n ");
		try
		{
			System.out.print(" Enter a number  : ");
			n = Integer.parseInt(in.readLine());
			for(int i=0;i<n;i++)
				sum = sum + (float)1/(i+1);
			System.out.println("\nSum of Harmonic series 1 + 1/2 + 1/3 + .....1/" + n+" is : " + sum);
		}
		catch(Exception e)
		{
			System.out.println("I/O Error");
		}
	}
}