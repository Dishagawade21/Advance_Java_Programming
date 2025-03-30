import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class passwordfield_and_textfield extends JApplet implements ActionListener
{ 
	
	JLabel l1,l2;
	JTextField t1,t2;
	JPasswordField p1;
	JButton b1;
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new GridLayout(4,2));
		l1=new JLabel("Enetr username");
		l2=new JLabel("Enetr password");
		t1=new JTextField();
		p1=new JPasswordField();
		t2=new JTextField();
		b1=new JButton("Login");
		cp.add(l1);
		cp.add(t1);
		cp.add(l2);
		cp.add(p1);
		cp.add(t2);
		cp.add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{ 
		String us=t1.getText();
		String ps=p1.getText();
		if(us.equals("admin")&&ps.equals("tyco"))
		{
			t2.setText("login successfully");
		}
		else
		{
			t2.setText("Enter crrect username password");
		}
		
	}
}
/*<applet code="passwordfield_and_textfield" width=400 height=400>
</applet>*/
	

