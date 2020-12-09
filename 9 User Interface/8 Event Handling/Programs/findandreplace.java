import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
public class findandreplace extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField tf1,tf2,tf3;
	JButton b;
	public findandreplace()
	{
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		setTitle("find and replace");
		l1=new JLabel("String");
		add(l1);
		l1.setBounds(30,100,100,30);
		l2=new JLabel("Find");
		add(l2);
		l2.setBounds(30,140,100,30);
		l3=new JLabel("Replace");
		add(l3);
		l3.setBounds(30,180,100,30);
		tf1=new JTextField(40);
		add(tf1);
		tf1.setBounds(130,100,120,30);
		tf2=new JTextField(20);
		add(tf2);
		tf2.setBounds(130,140,100,30);
		tf3=new JTextField(20);
		add(tf3);
		tf3.setBounds(130,180,100,30);
		b=new JButton("Replace");
		add(b);
		b.setBounds(60,240,100,30);
		b.addActionListener(this);
		windowclose wc=new windowclose();
		addWindowListener(wc);
	}
	public class windowclose extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			tf1.setText(tf1.getText().replaceAll(tf2.getText(),tf3.getText()));
		}
	}
	public static void main(String arg[])
	{
		findandreplace x=new findandreplace();
	}
}