import java.awt.*;
import java.awt.event.*;
class myframe extends Frame
{
	Button b1;
	public static void main(String arg[])
	{
		myframe f=new myframe();
	}
	public myframe()
	{
		super("window title");
		b1=new Button("click here");
		add("center",b1);
		ButtonListener blisten=new ButtonListener();
		b1.addActionListener(blisten);
		setVisible(true);
		setSize(200,200);
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