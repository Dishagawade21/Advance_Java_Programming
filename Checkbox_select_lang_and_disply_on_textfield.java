import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Checkbox_select_lang_and_disply_on_textfield extends Applet implements ItemListener
{
	String str="";
   Checkbox c1,c2,c3,c4;
   TextField t1;
   public void init()
   {
	
	t1=new TextField(10);
	c1=new Checkbox("AJP");
	c2=new Checkbox("OSY");
	c3=new Checkbox("STE");
	c4=new Checkbox("CSS");
     add(c1);
     add(c2);
     add(c3);
     add(c4);
     add(t1);
     c1.addItemListener(this);
     c2.addItemListener(this);
     c3.addItemListener(this);
     c4.addItemListener(this);
   }
   public void itemStateChanged(ItemEvent ie)
   {
   	 str=" ";
  	if(c1.getState())
      str=str+c1.getLabel()+" ";

  	if(c2.getState())
      str=str+c2.getLabel()+" ";
	
  	if(c3.getState())
      str=str+c3.getLabel()+" ";

  	if(c4.getState())
      str=str+c4.getLabel()+" ";
  
     t1.setText(str);
  }
}
/*<applet code="Checkbox_select_lang_and_disply_on_textfield" width=400 height=400>
</applet>*/