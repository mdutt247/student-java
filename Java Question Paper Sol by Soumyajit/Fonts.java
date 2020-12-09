import java.applet.*;
import java.awt.*;
public class Fonts extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.white);
		String str=new String("Hellow world");
		g.setFont(new Font("TimesRoman",Font.BOLD,16));
		g.drawString(str,20,40);
		g.setFont(new Font("Courser",Font.BOLD,20));
		g.drawString(str,20,90);
	}
}