import javax.swing.*;
import java.awt.*;

public class SettingIconToFrame{
  public static void main(String[] args){
  JFrame frame = new JFrame("Setting an Icon for a frame");
  frame.setIconImage(Toolkit.getDefaultToolkit().getImage("download.jpg"));
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(400,400);
  frame.setVisible(true);
  }
}