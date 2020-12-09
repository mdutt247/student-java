import javax.swing.*;
import java.awt.event.*;

public class AddRemoveItemFromCombo{
  JComboBox combo;
  JTextField txtBox;
  public static void main(String[] args){
  AddRemoveItemFromCombo ar = new AddRemoveItemFromCombo();
  }

  public AddRemoveItemFromCombo(){
  JFrame frame = new JFrame("Add-Remove Item of a Combo Box");
  String items[] = {"Java", "JSP", "PHP", "C", "C++"};
  combo = new JComboBox(items);
  JButton button1 = new JButton("Add");
  txtBox = new JTextField(20);
  button1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){
  if (!txtBox.getText().equals("")){
  int a = 0;
  for(int i = 0; i < combo.getItemCount(); i++){
  if(combo.getItemAt(i).equals(txtBox.getText())){
  a = 1;
  break;
  }
  }
  if (a == 1)
 JOptionPane.showMessageDialog(null,"Combo has already this item.");
  else
  combo.addItem(txtBox.getText());
  }
  else{
  JOptionPane.showMessageDialog(null,"Please enter text in Text Box");
  }
  }
  });
  JButton button2 = new JButton("Remove");
  button2.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){
  if (combo.getItemCount() > 0)
  combo.removeItemAt(combo.getSelectedIndex());
  else
  JOptionPane.showMessageDialog(null,"Item not available");
  }
  });
  JPanel panel = new JPanel();
  JPanel panel1 = new JPanel();
  panel.add(txtBox);
  panel.add(combo);
  panel.add(button1);
  panel.add(button2);
  frame.add(panel);
//  frame.add(panel1);
  frame.setSize(400, 400);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}