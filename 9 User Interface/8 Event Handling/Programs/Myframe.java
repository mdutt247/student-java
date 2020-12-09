//by implimenting interfaces

import java.awt.*;
import java.awt.event.*;

public class Myframe extends Frame
{
	Button b1;
	public static void main(String s[])
	{
		Myframe f= new Myframe();
	}
	public Myframe()
	{
	super("Window title");
	setVisible(true);
	setSize(300,300);
	b1= new Button("Click here");
	add("Center",b1);

	ButtonListener blistener= new ButtonListener();
	b1.addActionListener(blistener);

	MyWindowListener wlisten= new MyWindowListener();
	addWindowListener(wlisten);
	}
}

class ButtonListener implements ActionListener
{
public void actionPerformed(ActionEvent evt)
{
	Button source=(Button)evt.getSource();
	source.setLabel("Button clicked");
}
}

class MyWindowListener implements WindowListener
{
public void windowClosing(WindowEvent w)
{
	System.exit(0);
}
public void windowClosed(WindowEvent w){}
public void windowOpened(WindowEvent w){}
public void windowActivated(WindowEvent w){}
public void windowDeactivated(WindowEvent w){}
public void windowIconified(WindowEvent w){}
public void windowDeiconified(WindowEvent w){}
}