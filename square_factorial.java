import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class square_factorial extends JApplet implements ActionListener 
{
     
     JButton b1,b2;
     JLabel l1,l2;
     JTextField t1,t2;
     public void init()
     {     
	 Container cp=getContentPane();
         cp.setLayout(new GridLayout(3,2));	  
	 t1=new JTextField(10);
	 t2=new JTextField(10);
	
	 l1=new JLabel("Enter Number:");
	 l2=new JLabel("Result:");

         b1=new JButton("SQUARE");
         b2=new JButton("FIBONACCI");
         cp.add(l1);
         cp.add(t1);
         cp.add(l2);
         cp.add(t2);
         cp.add(b1);
         cp.add(b2);
         b1.addActionListener(this);
         b2.addActionListener(this);
}	
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
        int a=Integer.parseInt(t1.getText());
        t2.setText(" "+(a*a));

    }
   if(ae.getSource()==b2)
    {
        int no=Integer.parseInt(t1.getText());
        int fact=1;
        for(int i=1; i<=no;i++)
		{
			fact=fact*i;
		}
        t2.setText(String.valueOf(fact));

    }
 }   
}
/*<applet code="square_factorial" width=200 height=200></applet>*/

