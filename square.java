import java.awt.*;
import java.applet.*;
public class square extends Applet
{
     
     Button b1,b2;
     Label l1,l2;
     public void init()
     {     
	 GridLayout g=new GridLayout(4,2);
         setLayout(g);	  
	 TextField t1=new TextField();
	 TextField t2=new TextField();
	 l1=new Label("Enter  Number:");
 	 l2=new Label("Result:");

         b1=new Button("SQUARE");
         b2=new Button("FIBONACCI");
         add(l1);
         add(t1);
         add(l2);
         add(t2);
         Panel p1=new Panel();
         p1.setLayout(g);
         p1.add(b1);
         p1.add(b2);
         add(p1);
     }
}
/*<applet code="square" width=500  height=500>
</applet>*/

