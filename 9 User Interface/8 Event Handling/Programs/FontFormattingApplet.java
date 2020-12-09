import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

/*
<applet code="FontFormattingApplet" width=600 height=100>
</applet>
*/

public class FontFormattingApplet extends Applet implements ItemListener
{
	List li;
	Label la;
	Choice ch;
	int fontSize;
	String style;
	Font myFont;
	CheckboxGroup radio;
	
		public void init()
		{
			fontSize=10;
			la=new Label("I love India");
			add(la);

			ch=new Choice();
			ch.add("Dialog");
			ch.add("TimesRoman");
			ch.add("Courier");
			add(ch);
			ch.addItemListener(this);

			li=new List(3,false);
			li.add("12");
			li.add("14");
			li.add("16");
			add(li);
			li.addItemListener(this);

			radio=new CheckboxGroup();

			Checkbox chbox1=new Checkbox("BOLD",radio,true);
			Checkbox chbox2=new Checkbox("ITALIC",radio,false);
			Checkbox chbox3=new Checkbox("PLAIN",radio,false);
			add(chbox1);
			add(chbox2);
			add(chbox3);
			chbox1.addItemListener(this);
			chbox2.addItemListener(this);
			chbox3.addItemListener(this);

			myFont = new Font("Courier",Font.PLAIN,fontSize);
			la.setFont(myFont);
		}
		
        public void itemStateChanged(ItemEvent e)
		{
			repaint();
		}

		public void paint(Graphics g)
		{
			try
			{
			if(li.getSelectedItem()!=null){
				fontSize = Integer.parseInt(li.getSelectedItem());
			}
			style = radio.getSelectedCheckbox().getLabel();
			
			if(style.equals("PLAIN"))
				myFont = new Font(ch.getSelectedItem(),Font.PLAIN,fontSize);
			else if(style.equals("BOLD"))
				myFont = new Font(ch.getSelectedItem(),Font.BOLD,fontSize);
			else if(style.equals("ITALIC"))
				myFont = new Font(ch.getSelectedItem(),Font.ITALIC,fontSize);
			else
				myFont = new Font(ch.getSelectedItem(),Font.PLAIN,fontSize);
		
			la.setFont(myFont);
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
		}	
}
