/*
 <applet code="SimpleImageLoad" width=248 height=146>
<param name="img" value="sunset.jpg">
 </applet>
*/
import java.awt.*;
import java.applet.*;

public class SimpleImageLoad extends Applet
{
	Image img;

	public void init() {
	img = getImage(getDocumentBase(), getParameter("img"));
	}

	public void paint(Graphics g) {
	g.drawImage(img, 0, 0, this);
	}
}