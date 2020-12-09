import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class scrollbar extends Frame implements AdjustmentListener
{
	Label l1,l2,l3;
	Scrollbar red,green,blue;
	
	public scrollbar()
	{
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		l1=new Label("red");
		l2=new Label("green");
		l3=new Label("blue");
		add(l1);
		add(l2);
		add(l3);
		l1.setBounds(30,60,100,30);
		l2.setBounds(30,100,100,30);
		l3.setBounds(30,140,100,30);
	    red=new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,255);
	    green=new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,255);
	    blue=new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,255);
		add(red);
		add(green);
		add(blue);
		red.setBounds(130,60,100,30);
		green.setBounds(130,100,100,30);
		blue.setBounds(130,140,100,30);
		red.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		int rv=red.getValue();
		int gv=green.getValue();
		int bv=blue.getValue();
		l1.setText("RED:"+rv);
		l2.setText("GREEN:"+gv);
		l3.setText("BLUE:"+bv);
		
		Color c=new Color(rv,gv,bv);
		setBackground(c);
		
	}
	public static void main(String arg[])
	{
		scrollbar x1=new scrollbar();
	}
}