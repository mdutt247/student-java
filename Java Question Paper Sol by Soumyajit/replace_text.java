//WAP to create 3 text fields - the text, find field and replace field . Use a button 'REPLACES' , which on clicking replaces 
// the fiend text in the main text window.
import javax.swing.*;
import java.awt.event.*;
class replace_text
{
	replace_text()
	{
		JTextField tf1,tf2,tf3,tfr;
		JLabel l1,l2,l3,lr;
		JButton bs,br;
		JFrame f = new JFrame();
		
		l1 = new JLabel("Enter a text : ");
		l2 = new JLabel("Find text to be repalce:");
		l3 = new JLabel("Replace with : ");
		lr = new JLabel("Result : ");
		tf1 = new JTextField("");
		tf2 = new JTextField("");
		tf3 = new JTextField("");
		tfr = new JTextField("");
		br =  new JButton("Replace");
		bs =  new JButton("EXIT");
		
		l1.setBounds(30,50,150,30);
		l2.setBounds(30,100,150,30);
		l3.setBounds(30,150,150,30);
		lr.setBounds(30,200,150,30);
		tf1.setBounds(200,50,150,30);
		tf2.setBounds(200,100,150,30);
		tf3.setBounds(200,150,150,30);
		tfr.setBounds(200,200,150,30);
		br.setBounds(30,300,80,40);
		bs.setBounds(130,300,80,40);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(lr);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tfr);
		f.add(br);
		f.add(bs);
		
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
		
		
		br.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					String replaceString="";
					
					String s1=tf1.getText();
					String s2=tf2.getText();
					String s3=tf3.getText();
					
					String arr[]=s1.split(" ");
					
					for(String ss: arr)
					{
						System.out.println(ss);
						
						if(ss.equals(s2))
						{
							replaceString=s1.replace(s2,s3);
						}
					}
					tfr.setText(replaceString);
				}
			}
		);
		
		bs.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					System.exit(0);
				}
			}
		);
	}
	public static void main(String args[])
	{
		new replace_text();
	}
}