import javax.swing.*;

public class CreateJList{
  public static void main(String[] args) {
  String subject[] = {"Math", "Computer", "Phisics", "Chemestry"};
  JFrame frame = new JFrame("Creating a JList Component");
  JPanel panel = new JPanel();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  JList list = new JList(subject);
  frame.setUndecorated(true);
  frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
  panel.add(list);
  frame.add(panel);
  frame.setSize(400,400);
  frame.setVisible(true);
  }
}