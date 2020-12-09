//Accept a month number in command line argument and accordingly display season-winter,spring,summer,autumn.
class month
{
	public static void main(String args[])
	{
		int month_no;
		System.out.println("Enter a month number : " + (month_no=Integer.parseInt(args[0])));
		if(month_no==11 || month_no==12 || month_no==1)
		{
			System.out.println("Winter");
		}
		else if(month_no==2 || month_no==3 ||month_no==4)
		{
			System.out.println("Spring");
		}
		else if(month_no==5 || month_no==6 ||month_no==7 ||month_no==8)
		{
			System.out.println("Summer");
		}
		else if(month_no==9 || month_no==10)
		{
			System.out.println("Autumn");
		}
	}
}