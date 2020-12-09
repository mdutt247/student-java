class leap_year_or_not
{
	public static void main(String []args)
	{
		int year=Integer.parseInt(args[0]);
		if (year%4==0)
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+" is not leap year");
		}
	}
}