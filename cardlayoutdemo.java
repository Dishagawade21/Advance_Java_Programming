import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class cardlayoutdemo extends Applet implements ActionListener
{
	
	CardLayout c1;
	Button b1,b2;
	Panel p1,co,os;
	public void init()
	{
	c1=new CardLayout();
	p1=new Panel();
	b1=new Button("color");
	b2=new Button("ops");
	p1.setLayout(c1);
	add(b1);
	add(b2);
	add(p1);

	co=new Panel();
	Checkbox ch1=new Checkbox("red");
	Checkbox ch2=new Checkbox("blue");
	co.add(ch1);
	co.add(ch2);

	os=new Panel();
	Checkbox ch3=new Checkbox("linux");
	Checkbox ch4=new Checkbox("windows");
	os.add(ch3);
	os.add(ch4);

	p1.add(co,"COLOR");
	
	p1.add(os,"OSP");
	b1.addActionListener(this);
	b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			c1.show(p1,"COLOR");
		}	
		if(ae.getSource()==b2)
		{
			c1.show(p1,"OSP");
		}

	}


	
}
/*<applet code="cardlayoutdemo" width=500 height=500>
</applet>*/