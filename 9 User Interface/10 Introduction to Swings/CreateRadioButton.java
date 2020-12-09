import javax.swing.*;
import java.awt.*;

public class CreateRadioButton{
  public static void main(String[] args) {
  CreateRadioButton r = new CreateRadioButton();
  }

  public CreateRadioButton(){
  JRadioButton Male,Female;
  JFrame frame = new JFrame("Creating a JRadioButton Component");
  JPanel panel = new JPanel();
  ButtonGroup buttonGroup = new ButtonGroup();
  Male = new JRadioButton("Male");
  buttonGroup.add(Male);
  panel.add(Male);
  Female = new JRadioButton("Female");
  buttonGroup.add(Female);
  panel.add(Female);
  Male.setSelected(true);
  frame.add(panel);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(400,400);
  frame.setVisible(true);
  }
}
