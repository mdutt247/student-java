import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class controlclass extends JFrame
{
	JLabel jlb;
	JButton jb;
	JTextField jtx;
	public controlclass()
	{
		super("event handling testing");
		setLayout(new FlowLayout());
		
		jlb=new JLabel("hello");
		add(jlb);
		
		jb=new JButton("show text");
		add(jb);
		
		jtx=new JTextField(20);
		jtx.setToolTipText("enter the text here");
		add(jtx);
		
		ActionHandling hand=new ActionHandling();
		jb.addActionListener(hand);
	}
	private class ActionHandling implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==jb)
			{
				JOptionPane.showMessageDialog(null,jtx.getText());
			}
		}
	}
}
public class mainclass
{
	public static void main(String arg[])
	{
		controlclass obj=new controlclass();
		obj.setVisible(true);
		obj.setSize(400,400);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}