//by extending adapter class

import java.awt.*;
import java.awt.event.*;

public class MyframeAdapter extends Frame
{
	Button b1;
	public static void main(String s[])
	{
		MyframeAdapter f= new MyframeAdapter();
	}
	public MyframeAdapter()
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

class MyWindowListener extends WindowAdapter
{
public void windowClosing(WindowEvent w)
{
	MyframeAdapter f = (MyframeAdapter) w.getSource();
	f.dispose();
	System.exit(0);
}

}