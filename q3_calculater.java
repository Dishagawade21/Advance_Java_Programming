import java.awt.*;
import java.applet.*;

public class q3_calculater extends Applet
{
	public void init()
	{
	GridLayout g =new GridLayout(5,4);
	
	Panel p1=new Panel();
	TextField t1=new TextField();
	Button b1=new Button("0");
	Button b2=new Button("1");
	Button b3=new Button("2");
	Button b4=new Button("3");
	Button b5=new Button("4");
	Button b6=new Button("5");
	Button b7=new Button("6");
	Button b8=new Button("7");
	Button b9=new Button("8");
	Button b10=new Button("9");
	Button b11=new Button("+");
	Button b12=new Button("-");
	Button b13=new Button("*");
	Button b14=new Button("/");
	Button b15=new Button("00");
	Button b16=new Button("AC");
	p1.setLayout(g);

	
	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	p1.add(b4);
	p1.add(b5);
	p1.add(b6);
	p1.add(b7);
	p1.add(b8);
	p1.add(b9);
	p1.add(b10);
	p1.add(b11);
	p1.add(b12);
	p1.add(b13);
	p1.add(b14);
	p1.add(b16);

	BorderLayout b= new BorderLayout();
	setLayout(b);
	add(t1,BorderLayout.NORTH);
	add(p1,BorderLayout.CENTER);


	}
}
/*<applet code="q3_calculater" width=500 height=500>
</applet>*/

