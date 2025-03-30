import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class RBchnge_background extends JApplet implements  ActionListener
{
	JRadioButton r1,r2,r3;
Container cp=getContentPane();
	public void init()
	{
       
		FlowLayout f=new FlowLayout();
        cp.setLayout(f);
		r1=new	JRadioButton("Red");
		r2=new	JRadioButton("Pink");
		r3=new	JRadioButton("Blue");
        ButtonGroup bg=new  ButtonGroup();
 		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		cp.add(r1);
		cp.add(r2);
		cp.add(r3);

		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae) 
{
  if(ae.getSource()==r1)
  {
    cp.setBackground(Color.red);
  }  
if(ae.getSource()==r2)
  {
    cp.setBackground(Color.green);
  } 
if(ae.getSource()==r3)
  {
    cp.setBackground(Color.pink);
  } 
}
}
/*<applet code="RBchnge_background" width=400 height=400>
</applet>*/