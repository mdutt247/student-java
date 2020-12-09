/*
WAJA that accepts text formeting options in combo boxces and display text "Welcome to the java world" in the center of the 
frame according to the options user selected.
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class text_formeting
{
	
	text_formeting()
	{
		JFrame f = new JFrame("Text Formeting");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String font[]={"Arial","Times New Roman","Vivaldi","Comic Sans MS"};
		JComboBox<String> jcbf = new JComboBox<String>(font);
		jcbf.setBounds(10,10,200,30);
		f.add(jcbf);
		
		String color[]={"Red","Greeen","Blue","Yellow"};
		JComboBox<String> jcbc = new JComboBox<String>(color);
		jcbc.setBounds(250,10,200,30);
		f.add(jcbc);
		
		String size[]={"10","14","20","28"};
		JComboBox<String> jcbs = new JComboBox<String>(size);
		jcbs.setBounds(500,10,200,30);
		f.add(jcbs);
		
		JLabel jl = new JLabel("Welcome to the java world",SwingConstants.CENTER);
		jl.setBounds(10,100,250,30);
		jl.setHorizontalAlignment(JLabel.CENTER);
		f.add(jl);
		
		f.setSize(900,300);
		f.setLayout(null);
		f.setVisible(true);
		
		checkbox1.addItemListener
		(
			new ItemListener() 
			{  
				public void itemStateChanged(ItemEvent e)
				{               
					
				}  
			}
		);  
	
	public static void main(String args[])
	{
		new text_formeting();
	}
}