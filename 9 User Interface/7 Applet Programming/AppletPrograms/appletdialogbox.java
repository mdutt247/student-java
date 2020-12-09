import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
public class appletdialogbox extends Applet implements ActionListener
{
	TextField t;
	Button b;
	public void init()
	{
		setLayout(new FlowLayout());
		setVisible(true);
		t=new TextField(20);
		b=new Button("check");
		add(t);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			String str=t.getText();
			String reverse="";
			System.out.println(str);
			int len=str.length();
			System.out.println(len);
			for(int i=len-1;i>=0;i--)
			{
				reverse=reverse+str.charAt(i);
			}
			System.out.println(reverse);
			if(str.equals(reverse))
			{
				JOptionPane.showMessageDialog(null,"String is palindrome");
				//t.setText("String is palindrome");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"String is not palindrome");
				//t.setText("String is not palindrome");
			}
		}
	}
}