import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class SwingButtonClick extends JFrame{
  JLabel msgLabel;

  public SwingButtonClick()
  {
  super("Swing Button Click Example");
  setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

  addWindowListener(new WindowAdapter(){
  public void windowClosing(WindowEvent e){
  System.exit(0);
  }
  });

  ActionListener al = new ActionListener(){
  public void actionPerformed(ActionEvent ae){
  msgLabel.setText(((JButton)ae.getSource()).getText());
  }
  };

  JButton button;
  JPanel buttonPanel = new JPanel();
  buttonPanel.setBorder(new TitledBorder("Click a button"));
  for (int i = 0; i < 3; i++){
  button = new JButton("Button " + (i + 1));
  button.addActionListener(al);
  buttonPanel.add(button);
  }

  JPanel p = new JPanel(new BorderLayout());
  p.setBorder(new EmptyBorder(8, 8, 8, 8));
  msgLabel = new JLabel("No button pressed!");
  p.add(msgLabel, BorderLayout.NORTH);
  p.add(buttonPanel, BorderLayout.CENTER);
  setContentPane(p);
  pack();

  //pack()- Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
  //If the window and/or its owner are not yet displayable, both are made displayable before calculating the preferred size.
  //The Window will be validated after the preferredSize is calculated.
  //http://docs.oracle.com/javase/6/docs/api/java/awt/Window.html#pack%28%29

  setVisible(true);
  }

  public static void main(String[] args){
  new SwingButtonClick();
  }
}