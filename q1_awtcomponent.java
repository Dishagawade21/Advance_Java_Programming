import java.awt.*;
import java.applet.*;

public class q1_awtcomponent extends Applet
{
	public void init()
	{
	GridLayout g =new GridLayout(6,2);
	setLayout(g);
	Label l1=new Label("Enter Student Name.");
	Label l2=new Label("Enter Student Rpllno");
	Label l3=new Label("Gender");
	Label l4=new Label("Hobbies.");
	Label l5=new Label("Select branch");
	Label l6=new Label("Select year");

	TextField t1=new TextField();
	TextField t2=new TextField();
	Panel p1=new Panel();
	CheckboxGroup cbg =new CheckboxGroup();
	Checkbox ch1=new Checkbox("Male",cbg,false); 
	Checkbox ch2=new Checkbox("Female",cbg,false); 
	p1.add(ch1);
	p1.add(ch2);
	Panel p2=new Panel();
	Checkbox ch3=new Checkbox("Writing",false); 
	Checkbox ch4=new Checkbox("Reading",false); 
	Checkbox ch5=new Checkbox("Playing",false); 
	p2.add(ch3);
	p2.add(ch4);
	p2.add(ch5);


	Choice c1= new Choice();
	c1.add("CO");
	c1.add("IT");
	c1.add("CIVIL");


	List lt= new List();
	lt.addItem("FY");
	lt.addItem("SY");
	lt.addItem("TY");
	
	
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	
	add(l5);
	add(c1);
	add(l6);
	add(lt);
	add(l3);
	add(p1);
	add(l4);
	add(p2);

	}
}
/*<applet code="q1_awtcomponent" width=500 height=500>
</applet>*/

