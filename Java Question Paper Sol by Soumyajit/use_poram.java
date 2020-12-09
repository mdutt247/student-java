import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class use_poram extends Applet
{
	public void paint(Graphics g)
	{
		String str = getParameter("msg");
		g.drawString(str,50,50);
	}
}