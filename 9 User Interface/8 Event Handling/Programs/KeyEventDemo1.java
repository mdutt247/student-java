import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class keytyped extends Frame implements KeyListener
{
	String keyString="";
	public keytyped()
	{
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent e)
	{
		int keycode=e.getKeyCode();
		keyString="keyCode=" + keycode + "("+e.getKeyText(keycode) + ")";
		repaint();
	}
	public void keyTyped(KeyEvent e)
	{
	}
	public void keyReleased(KeyEvent e)
	{
	}
	public void paint(Graphics g)
	{
		g.drawString(keyString,80,80);
	}
	public static void main(String arg[])
	{
		keytyped x1=new keytyped();
	}
}