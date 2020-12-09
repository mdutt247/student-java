import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class onclickmousecircle extends Applet implements MouseListener
{
	String str;
	int x,y,a,b;
	public void mouseClicked(MouseEvent e)
	{
		str="mouseClicked";
		x=e.getX();
		y=e.getY();
		a=60;
		b=60;
		repaint();
	}
	public void mouseEntered(MouseEvent e)
	{
		str="mouseEntered";
		repaint();
	}
	public void mousePressed(MouseEvent e)
	{
		str="mousePressed";
		repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		str="mouseExited";
		repaint();
	}
	public void mouseReleased(MouseEvent e)
	{
		str="mouseReleased";
		repaint();
	}
	public void init()
	{
		x=0;
		y=0;
		addMouseListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawOval(x , y ,a,b);
		g.drawString(str,50,50);
	}
}