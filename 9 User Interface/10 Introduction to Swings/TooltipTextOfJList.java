import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TooltipTextOfJList{
  private JScrollPane scrollpane = null;
  JList list;
  JTextField txtItem;
  DefaultListModel model;
  public static void main(String[] args){
  TooltipTextOfJList tt = new TooltipTextOfJList();
  }

  public TooltipTextOfJList(){
  JFrame frame = new JFrame("Tooltip Text for List Item");
  String[] str_list = {"One", "Two", "Three", "Four"};
  model = new DefaultListModel();
  for(int i = 0; i < str_list.length; i++)
  model.addElement(str_list[i]);
  list = new JList(model){
  public String getToolTipText(MouseEvent e) {
  int index = locationToIndex(e.getPoint());
  if (-1 < index) {
  String item = (String)getModel().getElementAt(index);
  return item;
  } else {
  return null;
  }
  }
  };
  txtItem = new JTextField(10);
  JButton button = new JButton("Add");
  button.addActionListener(new MyAction());
  JPanel panel = new JPanel();
  panel.add(txtItem);
  panel.add(button);
  panel.add(list);
  frame.add(panel, BorderLayout.CENTER);
  frame.setSize(400, 400);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public class MyAction extends MouseAdapter implements ActionListener{
  public void actionPerformed(ActionEvent ae){
  String data = txtItem.getText();
  if (data.equals(""))
  JOptionPane.showMessageDialog(null,"Please enter text in the Text Box.");
  else{
  model.addElement(data);
  JOptionPane.showMessageDialog(null,"Item added successfully.");
  txtItem.setText("");
  }
  }
  }
}