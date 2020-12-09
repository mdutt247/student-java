import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class MouseDrag extends Applet implements MouseMotionListener
{
	public void init()
	{
		addMouseMotionListener(this);
		setBackground(Color.red);
	}
	public void mouseDragged(MouseEvent me)
	{
		Graphics g;
		g.setColor(Color.white);
		g.fillOval(me.getX(),me.getY(),5,5);
	}
}