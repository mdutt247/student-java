import java.awt.*;
import java.applet.*;

public class javaparam extends Applet
{
	String str;
	public void init()
	{
		str = getParameter("strParam");
		if (str == null)
		{
			str = "JAVA";
		}
		str = " HELLO " + str;
	}
	public void paint(Graphics g)
	{
			g.drawString(str,10,100);
	}
}
