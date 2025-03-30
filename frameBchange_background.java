import java.awt.*;
import java.awt.event.*;
public class frameBchange_background extends Frame implements ActionListener
{
	Button b1,b2,b3;
    frameBchange_background ()
	{	
       FlowLayout f=new FlowLayout();
       setLayout(f); 
        setTitle("frame Button change_background color");
		//setSize(400,400);
		setVisible(true);
		b1=new Button("Red");
		b2=new Button("Pink");
		b3=new Button("Blue");
        add(b1);
        add(b2);
        add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae) 
{
    if(ae.getSource()==b1)
    {
      setBackground(Color.red);
    }
 if(ae.getSource()==b2)
    {
      setBackground(Color.pink);
    } if(ae.getSource()==b3)
    {
      setBackground(Color.blue);
    }
}
public static void main(String args[])
{
  frameBchange_background bg=new frameBchange_background ();
}
}
