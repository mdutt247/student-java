import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class MouseClickDrwaDeleteRect extends Applet implements MouseListener
{
    int xcord, ycord, size=100, click=0;

    public void start( ){
        addMouseListener(this);
        setSize(300,300);
    }
    public void paint ( Graphics g){
		if(click%2==1){
                g.setColor(Color.red);
                g.fillRect(xcord,ycord,size,size);
		}
		else{
                g.fillRect(xcord,ycord,0,0);
		}
    }
    public void mouseClicked( MouseEvent e)    {
    	click++;
        xcord=e.getX();
        ycord=e.getY();
        repaint();
    }
    public void mousePressed(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseExited(MouseEvent e){}

}
/*
<applet code	= "MouseClickDrwaDeleteRect.class"	width	= "400"	height	= "300" >
</applet>
*/