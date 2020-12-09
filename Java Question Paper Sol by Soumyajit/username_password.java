//WAJP to create the login window and also verify username and password of a user.

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;

class username_password
{
	Frame f=new Frame();
	Label lName,lPass;
	TextField tfName,tfPass,tf;
	Button b1,b2;
	//String User,pass;
	
	username_password()
	{
		lName=new Label("Enter your name : ");
		lName.setBounds(50,100,200,30);
		f.add(lName);
		
		tfName=new TextField("" ,100);
		tfName.setBounds(250,100,200,30);
		f.add(tfName);
		
		lPass=new Label("Password : ");
		lPass.setBounds(50,150,200,30);
		f.add(lPass);
		
		tfPass=new TextField("" ,100);
		tfPass.setEchoChar('*');
		tfPass.setBounds(250,150,200,30);
		f.add(tfPass);
		
		b1=new Button("Submit");
		b1.setBounds(70,200,100,30);
		f.add(b1);
		
		b2=new Button("Exit");
		b2.setBounds(200,200,100,30);
		f.add(b2);
		
		tf=new TextField("");
		tf.setEditable(false);
		tf.setBounds(100,250,200,30);
		f.add(tf);
		
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
		b1.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					String user=tfName.getText();
					String pass=tfPass.getText();
					if(user.equals("happy") && pass.equals("fan"))
					{
						tf.setText("Welcome");
					}
					else
					{
						tf.setText("Get Lost");
					}
				}
			}
		);
		
		b2.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					System.exit(0);
				}
			}
		);
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
		new username_password();
	}
}