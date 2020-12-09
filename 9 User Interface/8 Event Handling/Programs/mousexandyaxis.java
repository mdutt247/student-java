import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
public class mousexandyaxis extends Frame implements MouseListener
{
	String msg;
	int x,y;
	public mousexandyaxis()
	{
		super("mouse x and y axis");
		//setLayout(new FlowLayout());
		setSize(400,500);
		setVisible(true);
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e)
	{
		msg="Mouse Clicked ";
		x=e.getX();
		y=e.getY();
		repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		msg="Mouse Exited ";
		x=e.getX();
		y=e.getY();
		repaint();
	}
	public void mousePressed(MouseEvent e)
	{
		msg="Mouse Pressed ";
		x=e.getX();
		y=e.getY();
		repaint();
	}
	public void mouseReleased(MouseEvent e)
	{
		msg="Mouse Realesed ";
		x=e.getX();
		y=e.getY();
		repaint();
	}
	public void mouseEntered(MouseEvent e)
	{
		msg="Mouse Entered ";
		x=e.getX();
		y=e.getY();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg + "at " + x + "," + y , 50,50);
	}
	public static void main(String arg[])
	{
		mousexandyaxis x1=new mousexandyaxis();
	}
}