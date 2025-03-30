
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class addition extends JApplet implements ActionListener 
{
     
     JButton b1,b2,b3,b4;
     JLabel l1,l2,l3;
     JTextField t1,t2,t3;
     public void init()
     {     
	 Container cp=getContentPane();
         cp.setLayout(new GridLayout(7,2));	  
	 t1=new JTextField(10);
	 t2=new JTextField(10);
	 t3=new JTextField(10);

	 l1=new JLabel("Enter First Number:");
	 l2=new JLabel("Enter Second Number:");
 	 l3=new JLabel("Result:");

         b1=new JButton("ADDITIN");
         b2=new JButton("SUBTRACTION");
         b3=new JButton("MULTIPLICATION");         
         b4=new JButton("DIVISION");
         cp.add(l1);
         cp.add(t1);
         cp.add(l2);
         cp.add(t2);
         cp.add(l3);        
         cp.add(t3);

         cp.add(b1);
         cp.add(b2);
         cp.add(b3);
         cp.add(b4);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);


}	
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        t3.setText(" "+(a+b));

    }
   if(ae.getSource()==b2)
    {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        t3.setText(" "+(a-b));

    }
if(ae.getSource()==b3)
    {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        t3.setText(" "+(a*b));

    }
if(ae.getSource()==b4)
    {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        t3.setText(" "+(a/b));

    }
 }   
}
/*<applet code="addition" width=200 height=200></applet>*/

