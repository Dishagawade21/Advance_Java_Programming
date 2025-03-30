import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class change_background extends Applet implements ActionListener
{
	Button b1,b2,b3;
    public void init()
	{	
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
}
/*<applet code="change_background" width=400 height=400>
</applet>*/