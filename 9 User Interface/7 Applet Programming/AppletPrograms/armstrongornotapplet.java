import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class armstrongornotapplet extends Applet implements ActionListener
{
	TextField t;
	Button b;
	
	public void init()
	{
		setLayout(new FlowLayout());
		setVisible(true);
		t=new TextField(20);
		add(t);
		b=new Button("Check");
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		int num,n1,a,d,c=0;
		if(e.getSource()==b)
		{
			num=Integer.parseInt(t.getText());
			n1=num;
			while(num>0)
			{
				a=num%10;
				d=a*a*a;
				c=d+c;
				num=num/10;
			}
			if(n1==c)
			{
				JOptionPane.showMessageDialog(null,"Number is Armstrong");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Number is not Armstrong");
			}
		}
	}
}