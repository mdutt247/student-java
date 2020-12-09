import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class checkboxcolorchange extends Frame implements ItemListener
{
	CheckboxGroup radio=new CheckboxGroup();
	Checkbox cb,cb1,cb2;
	String color;
	public checkboxcolorchange()
	{

		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
		setTitle("checkbox on select background change");
		cb=new Checkbox("red",radio,false);
		cb1=new Checkbox("green",radio,false);
		cb2=new Checkbox("blue",radio,false);
		add(cb);
		add(cb1);
		add(cb2);
		cb.addItemListener(this);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource().equals(cb))
		{
			color="red";
			repaint();
		}
		else if(e.getSource().equals(cb1))
		{
			color="green";
			repaint();
		}
		else if(e.getSource().equals(cb2))
		{
			color="blue";
			repaint();
		}
	}
	public void paint(Graphics g)
	{
			if(color.equals("red"))
			{
				setBackground(Color.red);
			}
			else if(color.equals("green"))
			{
				setBackground(Color.green);
			}
			else if(color.equals("blue"))
			{
				setBackground(Color.blue);
			}

	}
	public static void main(String arg[])
	{
		checkboxcolorchange x1=new checkboxcolorchange();
	}
}