import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class adjustment_class_scrollbar extends Applet implements AdjustmentListener
{
	Scrollbar rs,gs,bs;
  public void init()
  {
      GridLayout g=new GridLayout(3,1,20,20);
	 setLayout(g);
	rs=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,250);
	gs=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,350);
	bs=new Scrollbar(Scrollbar.HORIZONTAL,0,30,0,450);
	add(rs);
	add(gs);
	add(bs);
	rs.addAdjustmentListener(this);
	gs.addAdjustmentListener(this);
	bs.addAdjustmentListener(this);
  }
  public void adjustmentValueChanged(AdjustmentEvent ae)
  {
 	int r=rs.getValue();
      int g=gs.getValue();
	int b=bs.getValue();
	Color c =new Color(r,g,b);
      setBackground(c);
  }
}
/*<applet code="adjustment_class_scrollbar" height=100 width=200>
</applet>*/