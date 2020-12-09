import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class colorchangeselecteditem extends Frame implements ItemListener
{
	Choice ch;
	String color;
	public colorchangeselecteditem()
	{
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
		setTitle("Change background on seleced item");
		ch=new Choice();
		ch.add("red");
		ch.add("yellow");
		ch.add("black");
		ch.add("green");
		add(ch);
		ch.addItemListener(this);
	}
	public void paint(Graphics g)
	{
		color=ch.getSelectedItem();
		if(color.equals("green"))
		{
			setBackground(Color.green);
		}
		else if(color.equals("red"))
		{
			setBackground(Color.red);
		}
		else if(color.equals("yellow"))
		{
			setBackground(Color.yellow);
		}
		else if(color.equals("black"))
		{
			setBackground(Color.black);
		}


	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public static void main(String arg[])
	{
	colorchangeselecteditem x1=new colorchangeselecteditem();
	}
}