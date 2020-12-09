import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
class mouseevent extends Frame implements MouseListener
{
	String msg;
	int x,y;
	public mouseevent()
	{
		setLayout(new FlowLayout());
		setVisible(true);
		setTitle("mouse event");
		setSize(200,200);
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e)
	{
		msg="mouse clicked";
		x=e.getX();
		y=e.getY();
		repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		msg="mouse exit";
		x=e.getX();
		y=e.getY();
		repaint();
	}
	 public void mouseEntered(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		msg="mouse entered";
		repaint();
	}
	public void mouseReleased(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		msg="mouse released";
		repaint();
	}
	public void mousePressed(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		msg="mouse pressed";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg + "at " + x + "," + y ,20,40);
	}
	public static void main(String arg[])
	{
		mouseevent x1=new mouseevent();
		//x1.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
	}
}