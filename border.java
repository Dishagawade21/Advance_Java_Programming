import java.applet.*;
import java.awt.*;
public class border extends Applet
{
	public void init()
	{
		BorderLayout b=new BorderLayout();
		setLayout(b);
		Button b1 =new Button("EAST");
		Button b2 =new Button("WEST");
		Button b3 =new Button("SOUTH");
		Button b4 =new Button("NORTH");
		TextArea ta=new  TextArea();
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.NORTH);


	}
}
/*<applet code="border" width=500 height=500>
</applet>*/