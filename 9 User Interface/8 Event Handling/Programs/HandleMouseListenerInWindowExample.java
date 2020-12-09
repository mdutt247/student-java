import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
* To create a stand alone window, class should be extended from
* Frame and not from Applet class.
*/

public class HandleMouseListenerInWindowExample extends Frame implements MouseListener{

        int x=0, y=0;
        String strEvent = "";

        HandleMouseListenerInWindowExample(String title){

                //call superclass constructor with window title
                super(title);

                //add window listener


                //add mouse listener
                addMouseListener(this);

                //set window size
                setSize(300,300);

                //show the window
                setVisible(true);
        }



        public void mouseClicked(MouseEvent e) {

                strEvent = "MouseClicked";
                x = e.getX();
                y = getY();
                repaint();
        }


        public void mousePressed(MouseEvent e) {
                strEvent = "MousePressed";
                x = e.getX();
                y = getY();
                repaint();

        }


        public void mouseReleased(MouseEvent e) {
                strEvent = "MouseReleased";
                x = e.getX();
                y = getY();
                repaint();

        }


        public void mouseEntered(MouseEvent e) {
                strEvent = "MouseEntered";
                x = e.getX();
                y = getY();
                repaint();

        }


        public void mouseExited(MouseEvent e) {
                strEvent = "MouseExited";
                x = e.getX();
                y = getY();
                repaint();

        }


        public void paint(Graphics g){
                g.drawString(strEvent + " at " + x + "," + y, 50,50);
        }

        public static void main(String[] args) {

                HandleMouseListenerInWindowExample myWindow =
                        new HandleMouseListenerInWindowExample("Window With Mouse Events Example");
        }


}

