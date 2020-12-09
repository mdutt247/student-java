import javax.swing.*;

public class CreateCheckBox{
  public static void main(String[] args){
  JFrame frame = new JFrame("Check Box Frame");
  JCheckBox chk = new JCheckBox("This is the Check Box");
  frame.add(chk);
  frame.setSize(400, 400);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
}
