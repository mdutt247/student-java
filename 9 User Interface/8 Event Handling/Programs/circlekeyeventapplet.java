import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class circlekeyeventapplet extends Applet implements KeyListener
{
	int height=20,width=20;
	public void init()
	{
		setVisible(true);
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyChar()=='b' || e.getKeyChar()=='l')
		{
			height=height+2;
			width=width+2;
		}
		else if(e.getKeyChar()=='s' || e.getKeyChar()=='d')
		{
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
}