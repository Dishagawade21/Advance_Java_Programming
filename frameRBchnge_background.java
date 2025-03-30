import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class frameRBchnge_background extends JFrame implements  ActionListener
{
	JRadioButton r1,r2,r3;
    Container cp=getContentPane();
	frameRBchnge_background()
	{
       setTitle("frameRBchange_background Color");
		setSize(400,400);
		setVisible(true);
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
    cp.setBackground(Color.pink);
  } 
if(ae.getSource()==r3)
  {
    cp.setBackground(Color.blue);
  } 
}
public static void main (String args[])
{
	frameRBchnge_background rb=new frameRBchnge_background();
}
}
