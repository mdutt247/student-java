//WAP to accept the number from user by command line argument.check that user should enter number only if not then display
//appropriate error message.(Hint Handle Exception)

class user_input
{
	public static void main(String args[])
	{
		try
		{
			char num=Integer.parseInt(args[0]);
			System.out.println("Entered number is: " + num);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
