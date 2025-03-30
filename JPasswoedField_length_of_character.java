import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class JPasswoedField_length_of_character extends JApplet implements ActionListener
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
		String ps=p1.getText();
		int l=ps.length();
		if(l<6)
		{
			t2.setText("Password length must be >6 characters");
		}
		else
		{
			t2.setText("Password length is be >6 characters");
		}
		
	}
}
/*<applet code="JPasswoedField_length_of_character" width=400 height=400>
</applet>*/
	

