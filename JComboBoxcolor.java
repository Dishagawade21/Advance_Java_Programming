import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JComboBoxcolor extends JApplet implements ItemListener
{   JComboBox c1;  
   JScrollPane sp; 
public void init()
   {
    Container cp=getContentPane();
    cp.setLayout(new FlowLayout());
    c1=new JComboBox();
    c1.addItem("red");
    c1.addItem("pink");
    c1.addItem("black");
    c1.addItem("white");
    int vsbPolicy=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
    int hsbPolicy=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
    sp=new JScrollPane(c1, vsbPolicy, hsbPolicy);
    cp.add(sp);
    c1.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
      String s=(String) c1.getSelectedItem();
      
    }  
}
/*<applet code="JComboBoxcolor" width=400 height=400></applet> */