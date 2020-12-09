//WAP to print your name in five different fonts in five diffetent colors.chose suteble background color for it.
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;

class name_font
{
	name_font()
	{
		Frame f =new Frame();
		
		Font font1 = new Font("Times New Roman",Font.BOLD,20);
		Label l1=new Label("Happy");
		l1.setBounds(50,50,130,30);
		f.add(l1);
		l1.setFont(font1);
		l1.setForeground(Color.PINK);
		
		Font font2 = new Font("Courier",Font.BOLD,20);
		Label l2=new Label("Happy");
		l2.setBounds(50,100,130,30);
		f.add(l2);
		l2.setFont(font2);
		l2.setForeground(Color.YELLOW);
		
		Font font3 = new Font("Serif",Font.BOLD,20);
		Label l3=new Label("Happy");
		l3.setBounds(50,150,130,30);
		f.add(l3);
		l3.setFont(font3);
		l3.setForeground(Color.GREEN);
		
		Font font4 = new Font("Arial",Font.BOLD,20);
		Label l4=new Label("Happy");
		l4.setBounds(50,200,130,30);
		f.add(l4);
		l4.setFont(font4);
		l4.setForeground(Color.BLUE);
		
		Font font5 = new Font("Viner Hand ITC",Font.BOLD,20);
		Label l5=new Label("Happy");
		l5.setBounds(50,250,130,30);
		f.add(l5);
		l5.setFont(font5);
		l5.setForeground(Color.RED);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		f.addWindowListener
		(
			new WindowAdapter()
			{  
				public void windowClosing(WindowEvent e)
				{
					f.dispose();  
				}  
			}
		);
	}
	
	public static void main(String args[])
	{
		new name_font();
	}
}