import java.awt.*;
import java.applet.*;

public class q2_list_choice extends Applet
{
	public void init()
	{
	List l1= new List();
	l1.addItem("red");
	l1.addItem("blue");
	l1.addItem("green");
	add(l1);

	Choice c1= new Choice();
	c1.add("red");
	c1.add("blue");
	c1.add("green");
	add(c1);


	}
}
/*<applet code="q2_list_choice" width=500 height=500>
</applet>*/
