import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class output6 extends JApplet implements ItemListener
{   JComboBox c1; 
    JLabel l1;   
    {
    Container cp=getContentPane();
    cp.setLayout(new FlowLayout());
    l1=new JLabel("You are in Mumbai");
    c1=new JComboBox();
    c1.addItem("Solapur");
    c1.addItem("Pune");
    c1.addItem("Banglore");
    c1.addItem("Mumbai");
    cp.add(c1);
    cp.add(l1);
    c1.addItemListener(this);

    }
    public void itemStateChanged(ItemEvent ie)
    {
      String s=(String) c1.getSelectedItem();
    }  
}
/*<applet code="output6" width=400 height=400>
</applet> */  