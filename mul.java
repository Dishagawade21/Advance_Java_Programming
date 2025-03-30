
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class mul extends JApplet implements ActionListener 
{
     
     JButton b1;
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

         b1=new JButton("MULTIPLICATION");         
        
         cp.add(l1);
         cp.add(t1);
         cp.add(l2);
         cp.add(t2);
         cp.add(l3);        
         cp.add(t3);

         cp.add(b1);
        
         b1.addActionListener(this);

}	
  public void actionPerformed(ActionEvent ae)
  {
   
if(ae.getSource()==b1)
    {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        t3.setText(" "+(a*b));

    }
 }   
}
/*<applet code="mul" width=300 height=300></applet>*/

