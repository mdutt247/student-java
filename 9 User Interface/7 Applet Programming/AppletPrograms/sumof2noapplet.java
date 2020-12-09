import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class sumof2noapplet extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Button b;
	int x,y,result;
	Label l1,l2,l3;
	public void init()
	{
		setLayout(null);
		setVisible(true);
		l1=new Label("First Number:");
		l2=new Label("Second Number:");
		l3=new Label("SUM:");
		add(l1);
		add(l2);
		add(l3);
		l1.setBounds(30,40,100,30);
		l2.setBounds(30,80,100,30);
		l3.setBounds(30,120,100,30);
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		b=new Button("Sum");
		add(t1);
		add(t2);
		add(t3);
		add(b);
		t1.setBounds(130,40,100,30);
		t2.setBounds(130,80,100,30);
		t3.setBounds(130,120,100,30);
		b.setBounds(80,160,100,30);
		b.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			x=Integer.parseInt(t1.getText());
			y=Integer.parseInt(t2.getText());
			result=x+y;
			t3.setText(""+result);
		}
	}
	public void paint(Graphics g)
	{
	}
}