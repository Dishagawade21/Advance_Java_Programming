import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class list_players_and_contrys extends Applet implements ItemListener
{     TextField  t1;
	List l1;
      public void init()
	{
       t1=new TextField(20);
	  l1=new List();
	  l1.addItem("shikhar dhawan");
	  l1.addItem("virat kohli");
	  l1.addItem("ravindra jaddeja");
	  l1.addItem("mohammed shami");
        add(l1);
	   add(t1);
     }
public void itemStateChanged(ItemEvent ie)
{
  String s="";
  String s1[]=l1.getSelectedItem();
  for(int i=0;i<s1.length;i++)
  {
	s=s+s1[i]+" ";
  }
	
  t1.setText(s);
}
}
/*<applet code="list_players_and_contrys" width=400 height=400>
</applet>*/
