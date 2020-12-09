import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.util.*;
public class date extends Applet implements MouseListener, MouseMotionListener
{
 int x, y;
 String str="";
 Date date = new Date();
 
 public void init()
 {
   addMouseListener(this);
   addMouseMotionListener(this);
 }
 
  // override ML 5 abstract methods
 public void mousePressed(MouseEvent e)
 {
   x = e.getX();
   y = e.getY();
   str = "";
   repaint();
 }
 
 public void mouseReleased(MouseEvent e)
 {
   x = e.getX();
   y = e.getY();
   str = "";
   repaint();
  }
  
  public void mouseClicked(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    str =date.toString();
    repaint();
  }
  
  public void mouseEntered(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    str = "";
    repaint();
  }
  
  public void mouseExited(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    str = "";
    repaint();
  }
  
   // override two abstract methods of MouseMotionListener
  public void mouseMoved(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    str = "";
    repaint();
  }
  
  public void mouseDragged(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    str = "";
    repaint();
  }
    // called by repaint() method

  public void paint(Graphics g)
  {
    g.setFont(new Font("Times New Roman", Font.BOLD, 20));
    g.drawString(str, x+10, y+20); //For showing string value
  }
}
