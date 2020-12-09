import java.awt.*;
import java.awt.event.*;

public class FrameKeyDemo extends Frame implements KeyListener
{
  public FrameKeyDemo()
  {
    addKeyListener(this);                   // link the frame with KL
                                            // window closing
    addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent e)
      {
        System.exit(0);
      }
    }
    );

    setSize(300,300);
    setVisible(true);
  }                                         // close constructor
                                            // override the 3 abstract methods of KL
  public void keyPressed(KeyEvent e) {  }   // give empty implementation if you would not like any action
  public void keyReleased(KeyEvent e) { }
  public void keyTyped(KeyEvent e)
  {
    char ch = e.getKeyChar();
    if(ch == 'r' || ch == 'R')              // if r or R is typed
    {
      setBackground(Color.red);
    }
    else if(ch == 'b'|| ch == 'B')     // if b or B is typed
    {
      setBackground(Color.blue);
    }
    else if(ch == 'y'|| ch == 'Y')    // if y or Y is typed
    {
      setBackground(Color.yellow);
    }
    else if(ch == 'a'|| ch == 'A')    // if a or A is typed
    {
      System.out.println("Good afternoon");
    }
    else if(ch == 'm'|| ch == 'M')      // if m or M is typed
    {
      System.out.println("Good Morning");
    }
    else
    {
      System.out.println("You typed " + ch + " but type r, b, y, a and m only");
    }
  }
  public static void main(String s[])
  {
    new FrameKeyDemo();
  }
}