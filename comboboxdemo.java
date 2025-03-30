import java.awt.*;
import javax.swing.*;

public class comboboxdemo extends JApplet 
{
	public void init()
	{
		Container cp=getContentPane();
		setLayout(new FlowLayout());
		JComboBox c=new JComboBox();
		c.addItem("English");
		c.addItem("marathi");
		c.addItem("hindi");
		cp.add(c);


	}
}
/*<applet code="comboboxdemo" width=500 height=500>
</applet>*/