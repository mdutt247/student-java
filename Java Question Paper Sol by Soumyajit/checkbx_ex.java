import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener; 

class checkbx_ex
{
	Frame f = new Frame();
	Label l,l1;
	Checkbox cb,cb1,cb2,cb3;
	Button b,bclear;
	List li;
	TextField tf;
	{
		l = new Label("Please select your area of interest");
		//l.setBackground(Color.yellow);
		l.setBounds(92,63,300,30);
		
		
		cb = new Checkbox("Reading",false);
		//cb.setBackground(Color.yellow);
		cb.setBounds(92,150,100,50);
		
		
		cb1 = new Checkbox("Dancing",false);
		//cb1.setBackground(Color.yellow);
		cb1.setBounds(92,200,100,50);
		
		
		cb2 = new Checkbox("Travelling",false);
		//cb2.setBackground(Color.yellow);
		cb2.setBounds(200,150,100,50);
		
		
		cb3 = new Checkbox("Surfing",false);
		//cb3.setBackground(Color.yellow);
		cb3.setBounds(200,200,100,50);
		
		
		b = new Button("Submit");
		//b.setBackground(Color.yellow);
		b.setBounds(146,250,50,50);
		
		bclear = new Button("Clear");
		bclear.setBounds(200,250,50,50);
		
		l1 = new Label("You have selected following option");
		//l1.setBackground(Color.yellow);
		l1.setBounds(92,270,300,100);
		

		li = new List(4);
		li.setBounds(92,350,300,300);
		
		f.add(li);
		f.add(l);
		f.add(cb);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(b);
		f.add(bclear);
		f.add(l1);
		
		f.setSize(800,800);
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
		
		b.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if (cb.getState()==true)
					{
						li.add(cb.getLabel());
					}
					if (cb1.getState()==true) 
					{
						li.add(cb1.getLabel());
					}
					if (cb2.getState()==true) 
					{
						li.add(cb2.getLabel());
					}
					if (cb3.getState()==true) 
					{
						li.add(cb3.getLabel());
					}
				}
			}
		);
		
		bclear.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					li.removeAll();
				}
			}
		);
		
	}
	 
	public static void main(String args[])
	{
		new checkbx_ex();
	}
}