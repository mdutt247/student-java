import java.applet.*;
import java.awt.*;

public class HelloWorldApplet extends Applet
{
     public void init()		// The method that will be automatically called  when the applet is started
     {
		// It is required but does not need anything.
     }

     public void stop()		// This method gets called when the applet is terminated. That's when the user goes to another page or exits the browser.
     {
		// no actions needed here now.
     }

     public void paint(Graphics g)	// The standard method that is used to paint things on screen. This overrides the empty Applet method, you can't called it "display" for example.
     {
		//method to draw text on screen
		// String first, then x and y coordinate.
      g.drawString("Hey hey hey",20,20);
      g.drawString("Hello World",20,40);
     }

}