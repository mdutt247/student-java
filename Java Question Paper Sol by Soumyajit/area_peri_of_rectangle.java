class area_peri_of_rectangle
{
	public static void main(String []args)
	{
		int len=Integer.parseInt(args[0]);
		int bre=Integer.parseInt(args[1]);
		System.out.println("Area of rectangle is : "+(len*bre));
		System.out.println("perimeter of rectangle is : "+(2*(len+bre)));
	}
}