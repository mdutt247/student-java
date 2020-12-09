import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class replaceword extends Frame implements ActionListener
{
	TextField t1,t2,t3;
	Button b;
	Label l1,l2,l3;
	public replaceword()
	{
		setLayout(null);
		setSize(500,500);
		setTitle("replaceword");
		setVisible(true);
		l1=new Label("String");
		l2=new Label("Find");
		l3=new Label("Replace");
		add(l1);
		add(l2);
		add(l3);
		l1.setBounds(30,100,100,30);
		l2.setBounds(30,140,100,30);
		l3.setBounds(30,180,100,30);
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		add(t1);
		add(t2);
		add(t3);
		t1.setBounds(130,100,200,30);
		t2.setBounds(130,140,100,30);
		t3.setBounds(130,180,100,30);
		b=new Button("replace");
		add(b);
		b.setBounds(60,220,100,30);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			t1.setText(t1.getText().replaceAll(t2.getText(),t3.getText()));
		//	repaint();
			t1.setBackground(Color.green);
		}
	}
	public void paint(Graphics g)
	{

	}
	public static void main(String arg[])
	{
		replaceword x1=new replaceword();
	}
}