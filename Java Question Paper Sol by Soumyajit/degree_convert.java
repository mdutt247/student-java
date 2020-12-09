import javax.swing.*;
import java.awt.event.*;

class degree_convert
{
	degree_convert()
	{
		JFrame f = new JFrame();
		JLabel lc,lf;
		JTextField tfc,tff;
		JButton bfar,bcel;
		
		lc = new JLabel("Enter degree in Celsius : ");
		lf = new JLabel("Degree in Fahrenheit : ");
		tfc = new JTextField("");
		tff = new JTextField("");
		bfar = new JButton("Convert into Fahrenheit");
		bcel = new JButton("Convert into Celsius");
		
		lc.setBounds(50,50,150,30);
		lf.setBounds(50,100,130,30);
		tfc.setBounds(200,50,130,30);
		tff.setBounds(200,100,130,30);
		bfar.setBounds(50,150,180,40);
		bcel.setBounds(250,150,150,40);
		
		f.add(lc);
		f.add(lf);
		f.add(tfc);
		f.add(tff);
		f.add(bfar);
		f.add(bcel);
		
		f.setSize(370,260);
		f.setLayout(null);
		f.setVisible(true);
		
		bfar.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					double cel=Double.parseDouble(tfc.getText());
					double far = (cel * 1.8)+32;
					tff.setText(Double.toString(far));
				}
			}
		);
		
		bcel.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					double far=Double.parseDouble(tff.getText());
					double cel;
					cel = (far-32)*5/9;
					tfc.setText(Double.toString(cel));
				}
			}
		);
	}
	
	public static void main(String args[])
	{
		new degree_convert();
	}
}