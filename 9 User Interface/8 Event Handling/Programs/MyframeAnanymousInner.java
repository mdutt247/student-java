//by using anonymous class

import java.awt.*;
import java.awt.event.*;

public class MyframeAnanymousInner extends Frame
{
	Button b1;
	public static void main(String s[])
	{
		MyframeAnanymousInner f= new MyframeAnanymousInner();
	}
	public MyframeAnanymousInner()
	{
	super("Window title");
	setVisible(true);
	setSize(300,300);
	b1= new Button("Click here");
	add("Center",b1);

	ButtonListener blistener= new ButtonListener();
	b1.addActionListener(blistener);

	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent w){
			dispose();
			System.exit(0);
		}
		});
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
