import java.awt.*;
import java.applet.*;

public class UserIn extends Applet
{
	TextField text1,text2;
	public void init()
	{		//creating two text boxes
			text1=new TextField(10);
			text2=new TextField(10);
			//add two textboxes
			add(text1);
			add(text2);
			text1.setText("0");
			text2.setText("0");

	}
	public void paint(Graphics g)
	{		int value1,value2;
			String s1,s2;
			s1=text1.getText();
			value1=Integer.parseInt(s1);
			s2=text1.getText();
			value2=Integer.parseInt(s2);
			int sum=value1+value2;
			String str="Sum="+String.valueOf(sum);
			g.drawString(str,100,100);
	}
	public Boolean Action(Event event,Object object)
	{
		repaint();
		return true;
	}

}
