import java.applet.*;
import java.awt.*;
public class Myclock extends Applet implements Runnable
{
	Thread clockThread();
	public void start()   //method of applet
	{
		if(clockThread==null)
		{
			clockThread=new Thread(this);
			clockThread.start();   //start method of thread
		}
	}
}