//Define a class course.define another class Bca_course which will inherit the Course class.Write consructor for both classes.
//Override get_eligibility().Note-[Assume necessary data member]

public class Course
{
	Course()
	{
		int bca,mba,bba;
	}
	public void get_eligibility(double mark)
	{
		if(mark>40)
		{
			System.out.println("Eligibil for BCA");
		}
		else if(mark>25)
		{
			System.out.println("Eligibil for bba");
		}
		else if(mark>55)
		{
			System.out.println("Eligibil for mba");
		}
	}
}
class Bca_course extends Course
{
	Bca_course()
	{
		
	}
	public void get_eligibility()
	{
		
	}
}