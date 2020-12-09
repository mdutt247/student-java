public class MyDeadlock 
{
	String str1 = "Java";
    String str2 = "UNIX";
    Thread trd1 = new Thread("My Thread 1")
	{
        public void run()
		{
            while(true)
			{
                synchronized(str1)
				{
                    synchronized(str2)
					{
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    }; 
    Thread trd2 = new Thread("My Thread 2")
	{
        public void run()
		{
            while(true)
			{
                synchronized(str2)
				{
                    synchronized(str1)
					{
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };
    public static void main(String a[])
	{
        MyDeadlock mdl = new MyDeadlock();
        mdl.trd1.start();
        mdl.trd2.start();
    }
}
// class thread1 extends Thread
// {
	// String str1="java";
	// String str2="unix";
	// public void run()
	// {
		// for(int i=0;i<=10;i++)
		// {
			// synchronized(str1)
			// {
				// synchronized(str2)
				// {
					// System.out.println(str1+str2);
				// }
			// }
		// }
	// }
// }
// class thread2 extends Thread
// {
	// String str1="java";
	// String str2="unix";
	// public void run()
	// {
		// for(int i=0;i<=10;i++)
		// {
			// synchronized(str2)
			// {
				// synchronized(str1)
				// {
					// System.out.println(str2+str1);
				// }
			// }
		// }
	// }
// }
// public class MyDeadlock 
// {
	// public static void main(String arg[])
	// {
		// thread1 x1=new thread1();
		// x1.start();
		// thread2 x2=new thread2();
		// x2.start();
	// }
// }
		
