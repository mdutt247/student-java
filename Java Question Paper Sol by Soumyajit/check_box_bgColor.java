import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener; 

class check_box_bgColor
{
	check_box_bgColor()
	{
		Frame f=new Frame();
		Checkbox cbG,cbR,cbB;
		cbR=new Checkbox("Red",false);
		cbR.setBounds(100,100,130,30);
		f.add(cbR);
	
		cbB=new Checkbox("Blue",false);
		cbB.setBounds(100,150,130,30);
		f.add(cbB);
	
		cbG=new Checkbox("Green",false);
		cbG.setBounds(100,200,130,30);
		f.add(cbG);
		
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
		cbR.addItemListener
		(
			new ItemListener() 
			{  
				public void itemStateChanged(ItemEvent e) 
				{
					if(cbR.getState() == true)
					{
						
						f.setBackground(Color.RED);
					}
					if(cbR.getState() == false)
					{
						
						f.setBackground(Color.WHITE);
					}

				}  
			} 
		);
        cbB.addItemListener
		(
			new ItemListener() 
			{
				public void itemStateChanged(ItemEvent e) 
				{
					if(cbB.getState() == true)
					{
						
						f.setBackground(Color.BLUE);
					}
					if(cbB.getState() == false)
					{
						
						f.setBackground(Color.WHITE);
					}
				}  
			}
		);
		
		cbG.addItemListener
		(
			new ItemListener() 
			{
				public void itemStateChanged(ItemEvent e) 
				{
					if(cbG.getState() == true)
					{
						
						f.setBackground(Color.GREEN);
					}
					if(cbG.getState() == false)
					{
						
						f.setBackground(Color.WHITE);
					}
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
		new check_box_bgColor();
	}
}