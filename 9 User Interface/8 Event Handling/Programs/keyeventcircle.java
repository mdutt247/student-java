import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
public class keyeventcircle extends Frame implements KeyListener
{
	int height=20,width=20;
	public keyeventcircle()
	{
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyChar()=='b')
		{
			height=height+2;
			width=width+2;
			System.out.println(e.getKeyChar());
		}
		else if(e.getKeyCode()==KeyEvent.VK_S)
		{
			System.out.println(e.getKeyCode());
			height=height-2;
			width=width-2;
		}
		repaint();
	}
	public void keyReleased(KeyEvent e)
	{
	}
	public void keyTyped(KeyEvent e)
	{
	}
	public void paint(Graphics g)
	{
		g.drawOval(250,250,height,width);
	}
	public static void main(String arg[])
	{
		keyeventcircle x1=new keyeventcircle();
	}
}