//WANAP THAT DISPLAYS THE CURRENT X,YCORDENATE IN THE STATUS BAR WHEN EVER MOUSE IS MOVED
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class status_bar extends Applet implements MouseListener, MouseMotionListener
{
 int x, y;
 String str="";
 
 public void init()
 {
   addMouseListener(this);
   addMouseMotionListener(this);
 }
 
  // override ML 5 abstract methods

 
 public void mouseReleased(MouseEvent e)
 {
   x = e.getX();
   y = e.getY();
   str = "Mouse Released";
   repaint();
  }
  
  public void mouseClicked(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    str = "Mouse Clicked";
    repaint();
  }
  
  public void mouseEntered(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    str = "Mouse Entered";
    repaint();
  }
  
  public void mouseExited(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    str = "Mouse Exited";
    repaint();
  }

  public void mouseDragged(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    str = "Mouse dragged";
    repaint();
  }  
   // override two abstract methods of MouseMotionListener
  public void mouseMoved(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    str = "Mouse Moved";
    repaint();
  }
   public void mousePressed(MouseEvent e)
 {
   x = e.getX();
   y = e.getY();
   str = "Mouse Pressed";
   repaint();
 }

  public void paint(Graphics g)
  {
    g.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
    g.fillOval(x, y, 10, 10);
    g.drawString(x + "," + y,  x+10, y -10); //For showing coordinates
    g.drawString(str, x+10, y+20); //For showing string value
    showStatus(str + " at " + x + "," + y);
  }
}