import javax.swing.*;
import java.awt.*;

public class IconButton{
  public static void main(String[] args){
  JFrame frame = new JFrame("Icon on button");
  JButton button = new JButton("Click");
  Icon imgicon = new ImageIcon("download.jpg");
  JPanel panel = new JPanel();
  button.setIcon(imgicon);
  panel.add(button);
  frame.add(panel, BorderLayout.NORTH);
  frame.setSize(400, 400);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
