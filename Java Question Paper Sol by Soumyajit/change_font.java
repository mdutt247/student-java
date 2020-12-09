//11) WAP to print your name in five different fonts in five different color chouse sutable background color for it.
import java.applet.*;
import java.awt.*;
public class change_font extends Applet
{
		public void paint(Graphics p)
		{
			setBackground(Color.white);
			Font font1 = new Font("Arial",Font.PLAIN,20);
			p.setFont(font1);
			p.setColor(Color.red);
			p.drawString("happy",5,50);
			
			Font font2 = new Font("Colonna MT",Font.PLAIN,20);
			p.setFont(font2);
			p.setColor(Color.yellow);
			p.drawString("happy",5,100);
			
			Font font3 = new Font("Brush Script MT",Font.PLAIN,20);
			p.setFont(font3);
			p.setColor(Color.blue);
			p.drawString("happy",5,150);
			
			Font font4 = new Font("Berlin Sans FB",Font.PLAIN,20);
			p.setFont(font4);
			p.setColor(Color.green);
			p.drawString("happy",5,200);
			
			Font font5 = new Font("Bauhaus 93",Font.PLAIN,20);
			p.setFont(font5);
			p.setColor(Color.pink);
			p.drawString("happy",5,250);
		}
}