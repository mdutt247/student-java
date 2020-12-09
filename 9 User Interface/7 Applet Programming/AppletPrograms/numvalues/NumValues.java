import java.awt.*;
import java.applet.*;

/*
 <applet code="NumValues" width=248 height=146>

 </applet>
*/
public class NumValues extends Applet
{
	public void paint(Graphics g)
	{		int value1 = 20, value2 = 40;
			int sum = value1 + value2;
			String str = "Sum = " + String.valueOf(sum);
			g.drawString(str,10,100);
	}
}
