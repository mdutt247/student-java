import java.io.*;
class Test 
{
	int m1,m2,m3;
	double avg;
	void getdata() throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("Enter Marks 1 : ");
		m1=Integer.parseInt(in.readLine());
		System.out.println("Enter Marks 2 : ");
		m2=Integer.parseInt(in.readLine());
		System.out.println("Enter Marks 3 : ");
		m3=Integer.parseInt(in.readLine());
	}
	void display()
	{
		avg=(m1+m2+m3)/3;
		System.out.println("Average : "+avg);
	}
}

class Sport extends Test
{
	int score,nom;
	void getdata()throws IOException
	{
	super.getdata();
	DataInputStream in=new DataInputStream(System.in);
	System.out.println("Enter Score : ");
	score=Integer.parseInt(in.readLine());
	System.out.println("Enter No of matches :");
	nom=Integer.parseInt(in.readLine());
	}

	void display()
	{
		super.display();
		System.out.println("Score : "+score);
		System.out.println("No of Matches :"+nom);
	}


	}

	class Student extends Sport
	{
		int rollno;
		String name;

		void getdata() throws IOException
		{
			super.getdata();
			DataInputStream in=new DataInputStream(System.in);
	System.out.println("Enter Roll No : ");
	rollno=Integer.parseInt(in.readLine());
	System.out.println("Enter Name : ");
	name=in.readLine();
		}

		void display()
		{
			System.out.println("Name : "+name);
			System.out.println("Roll No : "+rollno);
			super.display();
		}

	}


class Sample
{

	public static void main(String[] args) throws IOException 
	{
		Student s1=new Student();
		s1.getdata();
		s1.display();
		
	}
}
