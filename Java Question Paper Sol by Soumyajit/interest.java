public class interest
{
	public double PrincipalAmount,number_years,rate_interest,time,simple_interest,compound_interest,x,y,z;
	interest(double p,double n, double r)
	{
		PrincipalAmount=p;
		number_years=n;
		rate_interest=r;
		simple_interest=(p*n*r)/100;
		System.out.println("Simple interest : "+simple_interest);
	}
	interest(double p1,double n1, double r1, double t)
	{
		PrincipalAmount=p1;
		number_years=n1;
		rate_interest=r1;
		time=t;
		y=(1+(r1/n1));
		z=(n1*t);
		x=Math.pow(y,z);
		compound_interest=p1*x;
		System.out.println("Compound interest : "+compound_interest);
	}
	public static void main(String args[])
	{
		interest obj=new interest(10000,2,0.5);
		interest obj1=new interest(50000,1,1,5);
	}
}